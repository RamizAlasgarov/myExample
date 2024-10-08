package myExamples___________.myExample5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dev {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my_examples/applicationContext5.xml");
        Person person = context.getBean("personBean",Person.class);
        Person person2 = context.getBean("personBean",Person.class);
        System.out.println(person == person2);
        person.callYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
