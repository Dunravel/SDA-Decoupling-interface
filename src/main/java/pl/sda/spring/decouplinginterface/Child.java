package pl.sda.spring.decouplinginterface;

import org.springframework.stereotype.Component;

@Component
public class Child {
    public String getName(){
        return "My name is...";
    }
}
