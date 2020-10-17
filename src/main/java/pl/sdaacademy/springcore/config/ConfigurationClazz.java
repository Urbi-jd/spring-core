package pl.sdaacademy.springcore.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import pl.sdaacademy.springcore.model.GreetingService;
import pl.sdaacademy.springcore.model.Hello;
import pl.sdaacademy.springcore.model.HelloImpl;
import pl.sdaacademy.springcore.model.WonderfulWorld;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigurationClazz {

    @Bean
    public Hello helloWorld() {
        return new HelloImpl();
    }

    @Bean(name = {"helloDay", "hello", "day"})
    public Hello helloDay() {
        return new WonderfulWorld("DAY");
    }

    @Bean(value = "helloWeek")
    @Profile(value = {"dev", "default"})
    public Hello helloWeekDev() {
        var bean = new WonderfulWorld();
        bean.setGreeting("DEV WEEK");
        return bean;
    }

    @Bean(value = "helloWeek")
    @Profile(value = {"prod"})
    public Hello helloWeekProd() {
        var bean = new WonderfulWorld();
        bean.setGreeting("PROD WEEK");
        return bean;
    }


    @Bean(value = "helloWeek")
    @Profile("test")
    public Hello helloWeekTest() {
        var bean = new WonderfulWorld();
        bean.setGreeting("TEST WEEK");
        return bean;
    }

    @Bean
    public GreetingService greeting() {
        return new GreetingService(helloDay());
    }
}
