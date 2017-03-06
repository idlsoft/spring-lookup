package example.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigExt {
    public String greeting() {
        return "Hello!";
    }
}
