package _20204_08_25_reflection.lamps;

import java.util.List;

/**
 * 3.умная лампа (перечень доступных функций, тип подключения к сети передачи данных)
 */

public class SmartLamp extends Lamp {
    private List<String> functions;
    private String connection;

    @Override
    public String toString() {
        return "SmartLamp{" +
                "functions=" + functions +
                ", connection='" + connection + '\'' +
                "} " + super.toString();
    }
}
