package myExamples___________.myExample3;

import myExamples___________.myExample2.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    myExamples___________.myExample2.Pet pet;

    @Autowired
    public Person( Pet pet) {
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("hi pet");
        pet.say();
    }
}
