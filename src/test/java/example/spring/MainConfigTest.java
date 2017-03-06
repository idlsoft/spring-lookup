package example.spring;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainConfigTest {
    @Test public void mainConfigCanLookupExt() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig.class);
        context.refresh();
        MainConfig config = context.getBean(MainConfig.class);
        assertThat(config.configExt().greeting(), is("Hello!"));
    }
}
