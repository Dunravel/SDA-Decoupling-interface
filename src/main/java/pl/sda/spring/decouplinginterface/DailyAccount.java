package pl.sda.spring.decouplinginterface;

import org.springframework.stereotype.Component;

@Component
public class DailyAccount implements Transferable {
    private String type;

    @Override
    public String transferMoney() {
        return "Daily";
    }
}
