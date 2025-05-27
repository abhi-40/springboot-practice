package org.abhishek;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements computer
{
    public Desktop()
    {
        System.out.println("Desktop object created");
    }
    @Override
    public void compile()
    {
        System.out.println("Compiling using desktop");

    }
}
