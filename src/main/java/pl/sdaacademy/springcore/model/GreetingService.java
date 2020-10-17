package pl.sdaacademy.springcore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GreetingService {
    private Hello greeter;

    public void greeting(){
        System.out.print("Have a nice time. ");
        greeter.sayHello();
    }
}
