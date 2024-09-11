package _2024_08_30.subject;

import _2024_08_30.annotation.Lifeforms;

@Lifeforms
public class BioRobot extends Robot{

    @Override
    public String toString() {
        return "Robot said " + makeSound();
    }


}
