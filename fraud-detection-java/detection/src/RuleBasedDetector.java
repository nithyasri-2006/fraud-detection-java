public class RuleBasedDetector {

    public static DetectionResult detect(Transaction tx) {

        // Simple rule example: flag large transactions
        boolean isFraud = tx.getAmount() > 5000;

        String message = isFraud ?
                "Fraud detected: High amount" :
                "Transaction normal";

        return new DetectionResult(tx.getId(), isFraud, message);
    }
}
