package pl.sda.spring.decouplinginterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    @Qualifier("daily")
    private Transferable transferable;

    @Autowired
    private UserData userData;

    private final String name = "janek";

    public String getMoney() throws Exception {
        if(userData.getName().equals(this.name)) {
            return transferable.transferMoney();
        } else {
            throw new Exception("no such user");
        }
    }
}
