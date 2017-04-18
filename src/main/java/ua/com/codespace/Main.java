package ua.com.codespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Dog.class);
        Dog dog = applicationContext.getBean(Dog.class);
        dog.say();
    }
}
