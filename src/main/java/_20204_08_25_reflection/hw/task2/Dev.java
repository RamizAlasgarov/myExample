package _20204_08_25_reflection.hw.task2;

import _20204_08_25_reflection.hw.task1.Person;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.regex.Pattern;

/**
 * 2 Создайте собственный класс, который будет сериализовать объект из задания 1 в JSON.
 * Используйте Reflection API для анализа полей объекта и их значений, чтобы динамически
 * создавать JSON-представление объекта
 */
public class Dev {
    public static void main(String[] args) {
        Person person = new Person("kkk", 22, true, 3.14);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
                 objectMapper.writeValue(Path.of("person.json").toFile(), person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
