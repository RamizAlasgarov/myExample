package myExample;

public class Person {
    Animal animal;

    public void setAnimal(Animal animal) {
        System.out.println("method setpet");
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void callYourPet(){
        System.out.println("hi pet");
        animal.say();
    }


}
