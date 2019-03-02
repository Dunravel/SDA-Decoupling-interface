package pl.sda.spring.decouplinginterface;

import org.springframework.stereotype.Component;

@Component
public class Account implements Transferable{
    private String type;

    public String transferMoney(){
        return "transferred from account";
    }
}
