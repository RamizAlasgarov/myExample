package myExamples.myExample4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dev {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");
        Person person = context.getBean("PersonBean",Person.class);
        person.callPet();
    }
}
