package pl.sda.spring.decouplinginterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DecouplingInterfaceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DecouplingInterfaceApplication.class, args);
        User user = context.getBean(User.class);
        try {
            System.out.println(user.getMoney());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
