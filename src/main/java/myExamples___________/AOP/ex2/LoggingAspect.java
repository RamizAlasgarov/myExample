package myExamples___________.AOP.ex2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice(){
        System.out.println("try take a book");
    }

    @Before("execution(public void returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("try return book");
    }
}
