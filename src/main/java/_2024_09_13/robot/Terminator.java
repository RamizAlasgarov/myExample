package _2024_09_13.robot;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Getter
@Component("terminator")
@Scope("prototype")
public class Terminator {
    private int zdorovye;

    public Terminator() {
        zdorovye = new Random().nextInt(1,30);
    }
}
