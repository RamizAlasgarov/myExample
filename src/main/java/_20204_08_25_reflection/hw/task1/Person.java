package _20204_08_25_reflection.hw.task1;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 1 Создайте класс с 10 методами и 4 приватными полями. Геттеры и сеттеры добавлять не
 * нужно. Создайте объект Вашего класса. Выведите в консоль информацию об объекте.
 * Затем пользователь вводит имя поля или метода. Программа определяет, имя какого
 * члена класса было введено. Если введено имя метода, то этот метод немедленно
 * вызывается. Если введено имя поля, то программа запрашивает у пользователя новое
 * значение и устанавливает его новым значением этого поля
 */
@AllArgsConstructor
@ToString
@JsonSerialize
@Getter
public class Person {
    private String mnimus;
    private int qnimus;
    private boolean falses;
    private double dubles;
    public void sayHello(){
        System.out.println("hello");
    }
    public void rabota_oficianta_V_konushne(){
        System.out.println("method rabota_oficianta_V_konushne");
    }
    public void pizzaMen_V_kuratnike(){
        System.out.println("method pizzaMen_V_kuratnike");
    }
    public void rabota_Nayemnogo_Rodstvennika(){
        System.out.println("method rabota_Nayemnogo_Rodstvennika");
    }
    public void menedcer_Po_2_yazikam(){
        System.out.println("method menedcer_Po_2_yazikam");
    }
    public void rabota_Parixmaxera_Na_Pochete(){
        System.out.println("method rabota_Parixmaxera_Na_Pochete");
    }
    private void rabota_Akulista_V_Markete(){
        System.out.println("method rabota_Akulista_V_Markete");
    }
    private void rabota_Xirurga_V_Pogrebe(){
        System.out.println("method rabota_Xirurga_V_Pogrebe");
    }
    public void expert_Po_prodaji_Diaqnoza(){
        System.out.println("method expert_Po_prodaji_Diaqnoza");
    }
    public void rabota_Povara_V_Laboratoriye(){
        System.out.println("method rabota_Povara_V_Laboratoriye");
    }
    public void sayBye(){
        System.out.println("method sayBye");
    }
}
