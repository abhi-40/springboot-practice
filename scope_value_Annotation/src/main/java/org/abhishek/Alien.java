package org.abhishek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien
{
    @Value("21")
    private int age;

    @Autowired
    @Qualifier("des")
    private Computer com;

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

    public Computer getCom()
    {
        return com;
    }

    public void setCom(Computer com)
    {
        this.com = com;
    }
}
