package _2024_08_30.subject;

import _2024_08_30.annotation.Lifeforms;

@Lifeforms
public class Human {
    public String makeSound(){
        return "hello world";
    }

    @Override
    public String toString() {
        return "human said " + makeSound();
    }


}
