package com.abhi.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class Laptop
{
    public void compile()
    {
        System.out.println("Compiling");
    }
}
