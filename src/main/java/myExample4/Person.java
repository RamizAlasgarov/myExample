package myExample4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("PersonBean")
public class Person {
    private Pet pet;

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        this.pet = pet;
//    }

    @Autowired
    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("hi my pet");
        pet.say();
    }
}
