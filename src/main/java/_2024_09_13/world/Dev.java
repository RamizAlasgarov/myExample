package _2024_09_13.world;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1 Создайте бин класса World. В классе определите конструктор,
 * который принимает название создаваемого мира и выводит фразу «Сотворение мира X».
 * Добавьте метод, выводящий в консоль сообщение «Восход цивилизаций».
 * Получите бин из контекста и вызовите метод
 *
 * Добавьте метод инициализации, который выводит сообщение «Заселение мира разными существами»,
 * и метод уничтожения бина, который выводит «Конец Света».
 */
public class Dev {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("lesson/applicationContext_2024_09_13World.xml");
        World world = context.getBean("worldBean",World.class);
        world.civilization();
        context.close();
    }
}
