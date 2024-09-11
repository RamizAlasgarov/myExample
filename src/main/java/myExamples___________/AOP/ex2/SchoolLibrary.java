package myExamples___________.AOP.ex2;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends Library {
    @Override
    public void getBook() {
        System.out.println("get school book");
    }
}
