package org.abhishek;

import org.abhishek.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt=context.getBean(Desktop.class);
        dt.compile();

        Desktop dt1=context.getBean(Desktop.class);
        dt.compile();

    }
}
