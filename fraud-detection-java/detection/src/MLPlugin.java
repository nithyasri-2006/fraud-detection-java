public class MLPlugin {

    public static boolean predict(Transaction tx) {
        double riskScore = tx.getAmount() / 5000.0;
        return riskScore > 0.7;
    }
}


