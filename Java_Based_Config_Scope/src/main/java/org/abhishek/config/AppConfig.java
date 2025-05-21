package org.abhishek.config;
import org.abhishek.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig
{
    @Bean()
    @Scope(value = "prototype")

    public Desktop desktop()
    {
        return new Desktop();
    }

}
