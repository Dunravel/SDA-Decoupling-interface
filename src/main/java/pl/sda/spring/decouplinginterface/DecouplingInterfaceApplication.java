package pl.sda.spring.decouplinginterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DecouplingInterfaceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DecouplingInterfaceApplication.class, args);
        User user = context.getBean(User.class);
        System.out.println(user.getMoney());
    }
}
