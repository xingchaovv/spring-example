package container;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class ContextOne {

    public static void main(String[] args) {
        ApplicationContext contextOne = new ClassPathXmlApplicationContext("container/context_one.xml");
        PetStore petStore = contextOne.getBean("petStore", PetStore.class);
        log.debug("{}", petStore);
    }
}
