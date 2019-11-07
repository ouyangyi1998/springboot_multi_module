package application.application;

import libary.demo.Service;
import libary.demo.ServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@Import(ServiceConfiguration.class)
@RestController
public class Application {
    private final Service service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Autowired
    public Application(Service service)
    {
        this.service=service;
    }
    @GetMapping("/")
    public String home()
    {
        return service.message();
    }
}
