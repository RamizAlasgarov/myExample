package _20204_08_25_reflection.exampleString;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Исследуйте класс String. Выведите в консоль
 * •полное, простое и каноническое имя класса
 * •в каком пакете находится
 * •какие модификаторы имеет
 * •наследником какого класса является
 * •какие интерфейсы имплементирует
 */
public class Dev {
    public static void main(String[] args) {
        Class<String> cls = String.class;
        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName());
        System.out.println(cls.getCanonicalName());
        System.out.println(cls.getPackage().getName());
        int modifier = cls.getModifiers();
        System.out.println(modifier);
        System.out.println(Modifier.isAbstract(modifier));
        System.out.println(Modifier.isPublic(modifier));
        System.out.println(Modifier.isStatic(modifier));
        System.out.println(Modifier.isFinal(modifier));

        System.out.println(cls.getSuperclass());
        System.out.println(cls.getSuperclass().getSuperclass());
        List<String> list = Arrays.stream(cls.getInterfaces()).map(e->e.getSimpleName()).collect(Collectors.toList());
        System.out.println(list);
    }
}
