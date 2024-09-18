package _2024_08_25_reflection.example3;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Создайте метод, который принимает переменную типа List. Выведите описание всех методов переданного списка. В main вызовите метод, передав в него
 * •экземпляр ArrayList
 * •экземпляр LinkedList
 * •экземпляр, полученный методом List.of().
 */
public class Dev {
    public static void main(String[] args) {
            printMethod(new ArrayList<>());
        System.out.println("-------------");
            printMethod(new LinkedList<>());
        System.out.println("-------------");
            printMethod(List.of());
        System.out.println("-------------");
    }
    private static void printMethod(List<String> strings){
        Class<?> cls = strings.getClass();
        List<Method> methods = List.of(cls.getDeclaredMethods());
        methods
                .forEach(e-> {
                    System.out.println(e.getName());
                    System.out.println("\treturns " + e.getReturnType());
                    System.out.println("\texeptions " + Arrays.stream(e.getExceptionTypes())
                            .map(type->type.getSimpleName()).toList());
                    System.out.println("\tparametrs " + Arrays.stream(e.getParameterTypes())
                            .map(p->p.getSimpleName()).toList());


                });
    }
}
