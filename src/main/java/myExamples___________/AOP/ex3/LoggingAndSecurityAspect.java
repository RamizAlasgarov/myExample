package myExamples___________.AOP.ex3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(void get*())")
    public void allGetMethods(){}

    @Pointcut("execution(* return*())")
    public void allReturnMethods(){}

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAspect: popitka vzat knigu");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: proverka prav na vzatiye knigi/jurnala");
    }

    @After("allReturnMethods()")
    public void afterReturnLoggingAdvice(){
        System.out.println("proverka na to cto kniga otdana");
    }

    @Before("allReturnMethods()")
    public void afterReturnSecurityAdvice(){
        System.out.println("proverka na pravo dostupa otdaci knigi/jurnala");
    }
}
