package myExamples.myExample4;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("mau-mau");
    }
}
