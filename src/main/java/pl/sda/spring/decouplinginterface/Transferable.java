package pl.sda.spring.decouplinginterface;

import org.springframework.stereotype.Component;

@Component
public interface Transferable {
    String transferMoney();
}
