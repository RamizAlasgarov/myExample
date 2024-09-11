package myExamples___________.AOP.ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfic.class);

        Library library = context.getBean("libraryBean",Library.class);
        library.getBook();

        context.close();
    }
}
