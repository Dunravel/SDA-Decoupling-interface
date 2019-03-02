package pl.sda.spring.decouplinginterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    @Qualifier("daily")
    private Transferable transferable;

    public String getMoney(){
        System.out.println(transferable.transferMoney());
        return transferable.transferMoney();
    }
}
