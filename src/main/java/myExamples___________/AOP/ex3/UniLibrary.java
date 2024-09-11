package myExamples___________.AOP.ex3;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary  extends Library{

    public void getBook(){
        System.out.println("UniLibrary : beru knigu");
    }

    public void getMagazine(){
        System.out.println("UniLibrary : beru jurnal");
    }

    public void returnBook(){
        System.out.println("otdayu knigu");
    }
    public void returnMagazine(){
        System.out.println("otdayu jurnal");
    }
}
