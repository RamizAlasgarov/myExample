package myExamples___________.myExample3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dev {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my_examples/applicationContext3.xml");
        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();
    }
}
