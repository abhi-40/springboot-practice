package org.abhishek;

public class Laptop implements computer
{
    public Laptop()
    {
        System.out.println("Desktop object Created");
    }
    @Override
    public void compile()
    {
        System.out.println("Compiling using LAPTOP");
    }
}
