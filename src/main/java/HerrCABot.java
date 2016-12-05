import actions.LunchPoll;
import connections.DirectConnector;

import java.io.IOException;

public class HerrCABot {
    public static void main(String[] args) throws IOException {
        LunchPoll lunchPoll = new LunchPoll();

        lunchPoll.createLunchPoll(DirectConnector.getSession(), "dev");
    }
}
