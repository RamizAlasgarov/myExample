package _2024_08_30.subject;


import _2024_08_30.annotation.Lifeforms;

@Lifeforms
public class Animal {
    public String makeSound(){
        return "cik cik";
    }

    @Override
    public String toString() {
        return "Animal said " + makeSound();
    }


}
