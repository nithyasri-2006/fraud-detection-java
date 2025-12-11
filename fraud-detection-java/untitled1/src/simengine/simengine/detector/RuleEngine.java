package detector;

import simengine.Transaction;

public class RuleEngine {

    // Simple rule-based fraud detection
    public boolean isFraudulent(Transaction t) {

        if (t.amount > 5000)
            return true;

        if (t.merchant.equals("Unknown Merchant"))
            return true;

        return false;
    }
}
