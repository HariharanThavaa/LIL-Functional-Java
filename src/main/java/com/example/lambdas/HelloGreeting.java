package com.example.lambdas;

public class HelloGreeting implements Greeting{
    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}
