package example.aspect;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 控制器返回日志切面
 */
@Component
@Aspect
@Slf4j
public class ControllerReturnLoggingAspect {

    /**
     * 定义切点
     */
    @Pointcut("execution(* example.controller..*.*Controller.*(..))")
    private void pointcutMethods() {}

    // 定义切面，在方法返回后记录返回内容
    @AfterReturning(pointcut = "pointcutMethods()", returning = "returnObj")
    public void log(JoinPoint joinPoint, Object returnObj) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();

        String returnString;
        int serializeMask = JSON.DEFAULT_GENERATE_FEATURE & ~SerializerFeature.SkipTransientField.getMask();
        returnString = String.format("%s", JSON.toJSONString(returnObj, serializeMask));

        log.info("控制器方法{}.{}，返回结果：{}", className, methodName, returnString);
    }
}
