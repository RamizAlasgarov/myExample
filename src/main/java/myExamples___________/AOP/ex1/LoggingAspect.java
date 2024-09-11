package myExamples___________.AOP.ex1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    @Before("execution(public void myExamples___________.AOP.ex1.Library.getBook())")
    public void getBookAdvice(){
        System.out.println("popitka vzat knigu");
    }
}
