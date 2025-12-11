package simengine;

import java.util.Random;
import java.util.UUID;

public class TransactionGenerator {

    Random rand = new Random();

    public Transaction generate(boolean fraud) {

        String txId = UUID.randomUUID().toString();
        String accountId = "ACC" + rand.nextInt(999);

        double amount;
        String merchant;
        String location;

        if (fraud) {
            amount = 6000 + rand.nextInt(15000);
            merchant = "Unknown Merchant";
            location = "Suspicious Location";
        } else {
            amount = 200 + rand.nextInt(2000);
            merchant = "Amazon";
            location = "Chennai";
        }

        return new Transaction(txId, accountId, amount, merchant, location);
    }
}
