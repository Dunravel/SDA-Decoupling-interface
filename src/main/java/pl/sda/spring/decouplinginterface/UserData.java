package pl.sda.spring.decouplinginterface;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class UserData {
    private String name = "janek";
    private Integer age = 23;
}
