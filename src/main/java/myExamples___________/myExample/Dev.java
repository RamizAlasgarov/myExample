package myExamples___________.myExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dev {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my_examples/applicationContext.xml");

        Person person = context.getBean("myPerson",Person.class);
        System.out.println(person.getAnimal());
    }
}
