package pl.sda.spring.decouplinginterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyConfiguration {

    @Bean
    List<Child> children() {
        ArrayList<Child> result = new ArrayList<>();
        result.add(new Child());
        result.add(new Child());
        result.add(new Child());

        return result;
    }
}
