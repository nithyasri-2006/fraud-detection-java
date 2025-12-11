import java.util.List;

public class Dashboard {

    public static void show(List<DetectionResult> results) {
        System.out.println("=== Fraud Detection Dashboard ===\n");

        for (DetectionResult result : results) {
            System.out.println(result);
        }

        long fraudCount = results.stream().filter(DetectionResult::isFraud).count();
        System.out.println("\nFlagged Transactions: " + fraudCount);
    }
}
