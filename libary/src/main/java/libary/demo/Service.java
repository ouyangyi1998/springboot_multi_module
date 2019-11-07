package libary.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

    private final String message;

    public Service(String message) {
        this.message = message;
    }
    public String message()
    {
        return this.message;
    }
}
