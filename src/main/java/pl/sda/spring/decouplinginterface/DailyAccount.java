package pl.sda.spring.decouplinginterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("daily")
public class DailyAccount implements Transferable {
    private String type;

    @Override
    public String transferMoney() {
        return "Daily";
    }
}
