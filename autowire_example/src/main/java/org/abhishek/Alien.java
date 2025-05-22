package org.abhishek;

public class Alien
{
    private int age;
    computer com;

    public Alien()
    {
        System.out.println("Alien object created");
    }

    public void code()
    {
        com.compile();
        System.out.println("Alien coding");
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public computer getCom()
    {
        return com;
    }

    public void setCom(computer com)
    {
        this.com = com;
    }
}
