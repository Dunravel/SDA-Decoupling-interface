package pl.sda.spring.decouplinginterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("account")
public class Account implements Transferable{
    private String type;

    public String transferMoney(){
        return "transferred from account";
    }
}
