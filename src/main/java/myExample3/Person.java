package myExample3;

import myExample2.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    Pet pet;

    @Autowired
    public Person( Pet pet) {
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("hi pet");
        pet.say();
    }
}
