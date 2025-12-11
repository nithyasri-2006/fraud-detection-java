public class DetectionResult {
    private String transactionId;
    private boolean fraud;
    private String message;

    public DetectionResult(String transactionId, boolean fraud, String message) {
        this.transactionId = transactionId;
        this.fraud = fraud;
        this.message = message;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public boolean isFraud() {
        return fraud;
    }

    public String getMessage() {
        return message;
    }

    // ⭐ ADD THIS METHOD ⭐
    @Override
    public String toString() {
        return "DetectionResult { " +
                "transactionId='" + transactionId + '\'' +
                ", fraud=" + fraud +
                ", message='" + message + '\'' +
                " }";
    }
}

