package _2024_09_15;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dev {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lesson/applicationContext_2024_09_15.xml");

        Host hostProperties = context.getBean("hostBean", Host.class);


        hostProperties.createNewToken();
        System.out.println(hostProperties);

        context.close();
    }
}
