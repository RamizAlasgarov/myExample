package myExamples___________.AOP.ex1;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public  void getBook(){
        System.out.println("beru knigu");
    }
}
