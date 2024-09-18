package _2024_09_13.fabric;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Реализуйте простую систему создания различных видов
 * транспортных средств. Создайте бин фабрики (TransportFactory), которая будет
 * иметь метод createTransport, возвращающий различные виды транспортных средств
 * (например, "Car", "Bicycle", "Motorcycle"). Используйте factory-method для создания объектов.
 * В описании бинов каждого из видов транспорта укажите factory-bean="transportFactory" factory-method="createTransport"
 */
public class Dev {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lesson/applicationContext_2024_09_13Fabrik.xml");
        TransportFactory factory = context.getBean("transportFactory",TransportFactory.class);
        System.out.println(factory.getMotorcycle());
        context.close();
//        Car car = context.getBean("car",Car.class);
//        System.out.println(car);
//        context.close();
    }
}
