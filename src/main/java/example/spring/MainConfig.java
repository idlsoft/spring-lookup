package example.spring;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigExt.class)
public abstract class MainConfig {
    public abstract @Lookup ConfigExt configExt();
}
