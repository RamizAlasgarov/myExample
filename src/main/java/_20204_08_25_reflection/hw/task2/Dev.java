package _20204_08_25_reflection.hw.task2;

import _20204_08_25_reflection.hw.task1.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 2 Создайте собственный класс, который будет сериализовать объект из задания 1 в JSON.
 * Используйте Reflection API для анализа полей объекта и их значений, чтобы динамически
 * создавать JSON-представление объекта
 */
public class Dev {
    public static void main(String[] args) {
        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("Person.json"));
            Person person = new Person("person",22,true,3.14);
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
