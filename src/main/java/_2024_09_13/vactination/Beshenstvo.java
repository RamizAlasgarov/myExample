package _2024_09_13.vactination;

import _2024_09_13.vactination.imterfacec.Privivka;
import org.springframework.stereotype.Component;

@Component
public class Beshenstvo implements Privivka {
    @Override
    public void usePrivivka() {
        System.out.println("ot beshenstva");
    }
}
