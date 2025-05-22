package org.abhishek.config;

import org.abhishek.Alien;
import org.abhishek.Desktop;
import org.abhishek.Laptop;
import org.abhishek.computer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.awt.SystemColor.desktop;

@Configuration
public class AppConfig
{
    @Bean
    public Alien alien(computer com)
    {
        Alien obj=new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }

    @Bean()
    public Laptop Lap()
    {
        return new Laptop();
    }

}
