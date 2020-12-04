package com.xingchaovv.spring.example.scheduling.support;

import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.scheduling.support.CronSequenceGenerator;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class SchedulingUsage {

    private static Map<Integer, Integer> circles;

    public static void main(String[] args) {
        SchedulingUsage usage = new SchedulingUsage();
        // usage.disperseEntry();
        // usage.random();
        usage.atomicInteger();
        // usage.increment();
    }

    private void increment() {
        int timeTag = 1001;
        circles = new HashMap<>();
        circles.put(timeTag, 0);

        Map<Integer, Integer> counts = new HashMap<>();
        int disperseSeconds = 1800;
        for (long i = 10000; ++i < 99999;) {
            int num = circles.get(timeTag);
            num++;
            if (num >= disperseSeconds) {
                num = 0;
            }
            circles.put(timeTag, num);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        counts.forEach((num, count) -> {
            log.info("num: {}, count:{}", num, count);
        });
    }

    private void atomicInteger() {
        AtomicInteger circle = new AtomicInteger();
        Map<Integer, Integer> counts = new HashMap<>();
        for (long i = 10000; ++i < 99999;) {
            int num = circle.incrementAndGet();
            long disperseSeconds = 1800L;
            if (num >= disperseSeconds) {
                circle.set(0);
                num = 0;
            }
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        counts.forEach((num, count) -> {
            log.info("num: {}, count:{}", num, count);
        });
    }

    private void random() {
        Random random = new Random();
        Map<Integer, Integer> counts = new HashMap<>();
        for (long i = 10000; ++i < 99999;) {
            int num = random.nextInt(1800);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        counts.forEach((num, count) -> {
            log.info("num: {}, count:{}", num, count);
        });
    }

    private void disperseEntry() {
        List<Long> msgIds = new ArrayList<>();
        for (long i = 10000; ++i < 99999;) {
            msgIds.add(i);
        }

        String cron = "0 0 7 * * ?";
        Date nextDate = getNextDate(cron);
        log.info("cron: {}, nextDate:{}", cron, nextDate);

        msgIds.forEach(msgId -> {
            disperse(msgId, nextDate);
        });
    }

    private void disperse(long msgId, Date nextDate) {
        long disperseSeconds = 1800L;
        int additionSeconds = (int) (msgId % disperseSeconds);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nextDate);
        calendar.add(Calendar.SECOND, additionSeconds);
        Date realDate = calendar.getTime();
        log.info("msgId: {}, nextDate: {}, realDate: {}", msgId, nextDate, realDate);
    }


    private void test1() {
        String cron1 = "0 */5 * * * *";
        log.info("cron: {}, nextDate:{}", cron1, getNextDate(cron1));

        String cron2 = "0 0 7 * * ?";
        log.info("cron: {}, nextDate:{}", cron2, getNextDate(cron2));

        String cron3 = "0 0 23 * * ?";
        log.info("cron: {}, nextDate:{}", cron3, getNextDate(cron3));
    }

    private Date getNextDate(String cron) {
        CronSequenceGenerator cronSequenceGenerator = new CronSequenceGenerator(cron);
        DateTime currDateTime = new DateTime();
        Date currDate = currDateTime.toDate();
        Date nextDate = cronSequenceGenerator.next(currDate);

//        log.info("currDateTime: {}", currDateTime);
//        log.info("currDate: {}", currDate);
//        log.info("nextDate: {}", nextDate);
        return nextDate;
    }
}
