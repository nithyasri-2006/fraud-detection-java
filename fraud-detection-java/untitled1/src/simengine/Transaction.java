package simengine;

import java.time.LocalDateTime;

public class Transaction {
    public String txId;
    public String accountId;
    public double amount;
    public String merchant;
    public String location;
    public LocalDateTime timestamp;

    public Transaction(String txId, String accountId, double amount,
                       String merchant, String location) {
        this.txId = txId;
        this.accountId = accountId;
        this.amount = amount;
        this.merchant = merchant;
        this.location = location;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return txId + " | " + accountId + " | " + amount + " | "
                + merchant + " | " + location + " | " + timestamp;
    }
}
