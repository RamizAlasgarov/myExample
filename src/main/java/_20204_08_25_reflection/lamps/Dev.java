package _20204_08_25_reflection.lamps;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Создайте иерархию классов световых приборов с тремя поколениями. Например,
 * 1.световой прибор (яркость свечения, цвет)
 * 2.электрическая лампа (потребляемая мощность, тип цоколя)
 * 3.умная лампа (перечень доступных функций, тип подключения к сети передачи данных)
 * Составьте мапу, в которой классу иерархии будут соответствовать его приватные поля. Выведите мапу в консоль.
 * Всем строковым полям присвойте значение «abc».
 */
public class Dev {
    public static void main(String[] args) {
        Map<Class<?>, List<Field>> classToPrivateFields = new HashMap<>();
        Class<?> sm = SmartLamp.class;
        do{
            List<Field> privateFields = Arrays.stream(sm.getDeclaredFields())
                    .filter(e-> Modifier.isPrivate(e.getModifiers()))
                    .toList();
            classToPrivateFields.put(sm,privateFields);
            sm = (Class<?>) sm.getSuperclass();
        }while (sm != null);
        classToPrivateFields.forEach((k,v) -> System.out.printf("%s: %s%n",k.getSimpleName(),v.stream()
                .map(f->f.getName())
                .toList()));

        SmartLamp smartLamp = new SmartLamp();
        System.out.println(smartLamp);

        classToPrivateFields.values().stream()
                .flatMap(e->e.stream())
                .filter(field->field.getType()
                        .equals(String.class))
                .forEach(fld->{
                    fld.setAccessible(true);
                    try {
                        fld.set(smartLamp,"abc");
                    } catch (IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    }
                    fld.setAccessible(false);
                });

        System.out.println(smartLamp);
    }
}
