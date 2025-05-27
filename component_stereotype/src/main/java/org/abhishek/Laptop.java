package org.abhishek;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop implements computer
{
    @Override
    public void compile()
    {
        System.out.println("Compiling using Laptop");

    }
}
