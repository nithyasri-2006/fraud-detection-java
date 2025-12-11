import java.util.List;
import java.util.stream.Collectors;

public class ApiGateway {

    public static List<Transaction> fetchTransactions() {
        return TransactionSimulator.generateBatch(50, 0.15);
    }

    public static List<DetectionResult> analyze(List<Transaction> transactions) {
        return transactions.stream()
                .map(tx -> RuleBasedDetector.detect(tx))
                .collect(Collectors.toList());
    }
}
