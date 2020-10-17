package pl.sdaacademy.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sdaacademy.springcore.config.ConfigurationClazz;
import pl.sdaacademy.springcore.model.GreetingService;
import pl.sdaacademy.springcore.model.Hello;



public class PlSdaSpringCoreApplication {

    public static void main(String[] args) {

//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClazz.class);

        var day1 = context.getBean("helloDay", Hello.class);
        var day2 = context.getBean("hello", Hello.class);
        var day3 = context.getBean("day", Hello.class);
        day1.sayHello();
        day2.sayHello();
        day3.sayHello();


        var week = context.getBean("helloWeek", Hello.class);
        week.sayHello();



        var greeter = context.getBean("greeting", GreetingService.class);
        greeter.greeting();
    }

}
