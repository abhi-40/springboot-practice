package org.abhishek.config;
import org.abhishek.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean(name={"desktop1","desktop2","desktop3"})

    public Desktop desktop()
    {
        return new Desktop();
    }

}
