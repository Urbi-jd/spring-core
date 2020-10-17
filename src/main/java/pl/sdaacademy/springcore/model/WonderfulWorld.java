package pl.sdaacademy.springcore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WonderfulWorld implements Hello {
    private String greeting = "World";

    @Override
    public void sayHello() {
        System.out.println("What a wonderful " + greeting + "!!!");
    }

}

