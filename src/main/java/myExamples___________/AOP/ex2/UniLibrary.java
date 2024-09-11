package myExamples___________.AOP.ex2;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends Library{
    @Override
    public void getBook() {
        System.out.println("get Uni Book");
    }

    public void returnBook(){
        System.out.println("otdal knigu UniLibrary");
    }
}
