package myExamples.myExample3;

import myExamples.myExample2.Pet;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("bow-wow");
    }
}
