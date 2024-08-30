package myExamples___________.myExample5;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
@Scope("prototype")
public class Person {
    Pet pet;
    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("cat") Pet pet) {
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("hi my Pet");
        pet.say();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy method");
        }
}
