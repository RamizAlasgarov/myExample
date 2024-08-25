package myExamples.myExample2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dev {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Pet cat = context.getBean("catBean",Cat.class);
        cat.say();
        context.close();
    }
}
