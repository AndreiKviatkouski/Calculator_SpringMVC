package by.Andrei_Kviatkouski;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.Operation;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class Config {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/pages/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }

    @Bean
    public List<Operation> operationsList() {
        return new ArrayList<>();


    }
}

