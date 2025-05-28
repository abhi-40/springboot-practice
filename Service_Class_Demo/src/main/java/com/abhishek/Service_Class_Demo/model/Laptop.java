package com.abhishek.Service_Class_Demo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer
{
    @Override
    public void compile()
    {
        System.out.println("Compiling using laptop");
    }
}
