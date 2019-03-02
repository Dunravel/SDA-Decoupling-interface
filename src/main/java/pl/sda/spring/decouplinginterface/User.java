package pl.sda.spring.decouplinginterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class User {
    @Autowired
    @Qualifier("daily")
    private Transferable transferable;

    //@Autowired
    private UserData userData;

    private final String name = "janek";

    @Autowired
    private List<Child> children;


    @Autowired
    public User(UserData userData) {
        this.userData = userData;
    }

    public String getMoney() throws Exception {
        if(userData.getName().equals(this.name)) {
            children.stream()
                    .map(Child::getName)
                    .forEach(System.out::println);
            return transferable.transferMoney();
        } else {
            throw new Exception("no such user");
        }
    }
}
