package myExamples___________.AOP.ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",SchoolLibrary.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary",UniLibrary.class);
        schoolLibrary.getBook();
        schoolLibrary.returnBook();

        uniLibrary.getBook();
        uniLibrary.returnBook();


        context.close();
    }
}
