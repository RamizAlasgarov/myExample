package _2024_09_13.fabric;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TransportFactory {




    public  Car getCar(){
return new Car();
    }
    public  Bicycle getBicycle(){
return new Bicycle();
    }
    public  MotorCycle getMotorcycle(){
return new MotorCycle();
    }
}

