package _2024_09_13.vactination;

import _2024_09_13.vactination.imterfacec.Privivka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Immunitet {
    Privivka privivka;

    @Autowired
    public Immunitet(@Qualifier("coronovirus") Privivka privivka) {
        this.privivka = privivka;
    }
}
