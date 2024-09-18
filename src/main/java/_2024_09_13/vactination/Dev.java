package _2024_09_13.vactination;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1 Создайте класс Иммунитет, содержащий поле типа Прививка. Прививка – интерфейс.
 * Сделайте разные имплементации прививки (от кори, от бешенства, от гриппа, от короновируса).
 * Создайте несколько бинов иммунитета, каждый иммунитет должен быть инжектирован своей прививкой:
 * иммунитет против кори, иммунитет против бешенства и т.д. Внедрите все иммунитеты в бин Организм.
 */
public class Dev {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("lesson/applicationContext_2024_09_13Vactination.xml");
        Immunitet immunitet = context.getBean("immunitet",Immunitet.class);
        immunitet.privivka.usePrivivka();
    }
}
