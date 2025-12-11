import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Transaction> txs = ApiGateway.fetchTransactions();
        List<DetectionResult> results = ApiGateway.analyze(txs);

        Dashboard.show(results);
    }
}
