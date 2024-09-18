package _2024_09_13.robot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalTime;

/**
 * 2 Создайте бины классов Terminator и JohnConnor.
 * JohnConnor обладает запасом здоровья, равным 100%.
 * Каждый терминатор обладает случайным запасом здоровья от 1 до 10.
 * Новый терминатор нападает на Джона раз в 3 секунды, каждый терминатор отнимает
 * у Джона столько здоровья, сколько есть у этого терминатора. Битва продолжается до тех пор,
 * пока Джон ещё жив или пока не вышла 1 минута времени.
 */
public class Dev {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lesson/applicationContext_2024_09_13Robot.xml");

        JohnConnor connor = context.getBean("conor",JohnConnor.class);
        LocalTime start = LocalTime.now();

        while (connor.getZdorovye()>0 && LocalTime.now().minusMinutes(1).isBefore(start)){
            Thread.sleep(3000);
            connor.fight(context.getBean("terminator",Terminator.class));
        }
        System.out.println("end Fight");
    }
}
