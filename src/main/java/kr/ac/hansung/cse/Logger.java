package kr.ac.hansung.cse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

    @Pointcut("execution(void kr.ac.hansung.cse.*.sound())")
    private void selectSound() {}

    @Before("selectSound()")
    public void aboutToSound() {
        System.out.println("before: about to sound");
    }
}