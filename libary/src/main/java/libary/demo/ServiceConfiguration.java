package libary.demo;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
@EnableConfigurationProperties(ServiceProperties.class)
public class ServiceConfiguration {
    @Bean
    public Service service(ServiceProperties properties)
    {
        return new Service(properties.getMessage());
    }
}
