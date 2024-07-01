package mavenproject2.demoTwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Welcome obj = (Welcome) context.getBean("msg");  // Welcome is the class

        System.out.println(obj.getMessage());
    }
}
