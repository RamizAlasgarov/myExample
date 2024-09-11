package _2024_08_30.subject;


public class Robot {
    public String makeSound(){
        return "01001";
    }

    @Override
    public String toString() {
        return "Robot said " + makeSound();
    }


}
