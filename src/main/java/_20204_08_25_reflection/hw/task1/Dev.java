package _20204_08_25_reflection.hw.task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 1 Создайте класс с 10 методами и 4 приватными полями. Геттеры и сеттеры добавлять не
 * нужно. Создайте объект Вашего класса. Выведите в консоль информацию об объекте.
 * Затем пользователь вводит имя поля или метода. Программа определяет, имя какого
 * члена класса было введено. Если введено имя метода, то этот метод немедленно
 * вызывается. Если введено имя поля, то программа запрашивает у пользователя новое
 * значение и устанавливает его новым значением этого поля
 */
public class Dev {
    public static void main(String[] args) throws NoSuchMethodException {
        Person person = new Person("kkk",1,true,2.2);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Object created: " + person);
        System.out.print("Enter the name of the field or method: ");
        String userInput = scanner.nextLine();
        try {
            Method method = person.getClass().getMethod(userInput);
            method.invoke(person);
        } catch (NoSuchMethodException e) {


            try {
                Field field = person.getClass().getDeclaredField(userInput);
                field.setAccessible(true);
                System.out.println("set field name");
                String value = scanner.nextLine();
                if (field.getType() == String.class) {
                    field.set(person, value);
                } else if (field.getType() == int.class) {
                    field.set(person, Integer.parseInt(value));
                } else if (field.getType() == boolean.class) {
                    field.set(person, Boolean.parseBoolean(value));
                } else if (field.getType() == double.class) {
                    field.set(person, Double.parseDouble(value));
                }
                System.out.println("znaceniye = " + field.get(person));
            } catch (NoSuchFieldException | IllegalAccessException ex) {
                System.out.println("no method or field");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}



