package myExamples___________.myExample4;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("bow - wow");
    }
}
