package _2024_08_30;

import _2024_08_30.annotation.Lifeforms;
import _2024_08_30.reflection.ReflectionHelper;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Создайте классы Human, Robot, Animal в пакете subject.
 * Создайте собственную аннотацию @Lifeforms и примените ее к классам Human и Animal.
 * Затем напишите класс ReflectionHelper, использующий Reflection API,
 * который по названию пакета получит все классы, отмеченные аннотацией @Lifeforms.
 * В методе main выведите названия всех найденных классов. Для каждого класса создайте
 * по одному объекту, используя рефлексию и конструктор по умолчанию.
 * Добавьте класс BioRobot, который расширяет класс Robot.
 * Укажите аннотацию @Lifeforms над классом BioRobot. Проверьте, что новый класс находится
 */
public class Dev {
    public static void main(String[] args) {

        List<Class<?>> classesWithAnnotation = ReflectionHelper.findAnnotatedClasses(
                "_2024_08_30.subject",
                Lifeforms.class
        );

        classesWithAnnotation.forEach(e-> {
            System.out.println(e.getSimpleName());
            System.out.println(getInstance(e));
        });

    }

    public static  <T> T  getInstance(Class<T> clazz){
        try {
            Constructor<T> cont = clazz.getDeclaredConstructor();
            return cont.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
