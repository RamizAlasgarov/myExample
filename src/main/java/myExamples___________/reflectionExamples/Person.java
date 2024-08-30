package myExamples___________.reflectionExamples;

import java.io.Serializable;
import java.util.Arrays;


public class Person  implements Serializable,Comparable<Person> {
    private String name;
    private int age;

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    private class B{
        String hi = "hello";
    }
}
class Dev{
    public static void main(String[] args) {
//        Person p =new Person("Ramiz",30);
//        Class<Person> cls = (Class<Person>) p.getClass();
//        System.out.println(cls);
//
//
//        Class<Person> cls2 = Person.class;
//        System.out.println(cls2.getName());
//        for (Method m : cls2.getMethods()){
//            System.out.println(m);
//        }
//        System.out.println(Arrays.toString(cls2.getMethods()));

//        int mod = Person.class.getModifiers();
//        System.out.println(mod);
//        System.out.println(Modifier.isPublic(mod));
//        Class<?> personClass = Person.class.getSuperclass();
//        System.out.println(personClass.getName());

//        Class<?>[] perInterf = Person.class.getInterfaces();
//        System.out.println(Arrays.toString(perInterf));
//
//        System.out.println(Arrays.toString(Person.class.getInterfaces()));
//        Class<String> cls = String.class;
//        int modif = cls.getModifiers();
//        System.out.println(Modifier.isPublic(modif));
//        System.out.println(Modifier.isFinal(modif));


        Class<Person> personClass = Person.class;
        System.out.println(personClass.getSimpleName());
        System.out.println(Arrays.toString(personClass.getDeclaredFields()));
        Class<?>[] perInterfaces = personClass.getInterfaces();
        for (Class<?> perInterface : perInterfaces) {
            System.out.println(perInterface);
        }

    }
}
