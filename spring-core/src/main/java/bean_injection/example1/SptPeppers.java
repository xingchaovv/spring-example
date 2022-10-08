package bean_injection.example1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SptPeppers implements Book {

    public SptPeppers() {
        log.info("In the construct of SptPeppers.");
    }

    @Override
    public void read() {
        log.info("In the method play of SptPeppers.");
    }
}
