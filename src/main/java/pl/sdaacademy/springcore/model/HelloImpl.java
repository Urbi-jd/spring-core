package pl.sdaacademy.springcore.model;

public class HelloImpl implements Hello {

    @Override
    public void sayHello() {
        System.out.println("Hello world!!!");
    }
}
