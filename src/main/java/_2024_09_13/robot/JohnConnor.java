package _2024_09_13.robot;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component("conor")
public class JohnConnor {
    private int zdorovye;

    public JohnConnor() {
        zdorovye = 10000000;
    }
    public void fight(Terminator terminator){
        System.out.println("konor s shoke ot ataki zdorovye terminatora " + terminator.getZdorovye());
        int result = zdorovye - terminator.getZdorovye();
        result = Math.max(result, 0);
        zdorovye = result;
        System.out.println("zdorovye " + zdorovye);
    }
}
