import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private String id;
    private LocalDateTime timestamp;
    private double amount;
    private String location;
    private long account;
    private boolean isFraud;

    public Transaction(double amount, String location, long account, boolean isFraud) {
        this.id = UUID.randomUUID().toString();
        this.timestamp = LocalDateTime.now();
        this.amount = amount;
        this.location = location;
        this.account = account;
        this.isFraud = isFraud;
    }

    public String getId() { return id; }
    public double getAmount() { return amount; }
    public String getLocation() { return location; }
    public boolean isFraud() { return isFraud; }

    @Override
    public String toString() {
        return id + " | $" + amount + " | " + location + " | Fraud? " + isFraud;
    }
}
