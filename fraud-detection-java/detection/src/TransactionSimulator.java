import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TransactionSimulator {
    private static final String[] LOCATIONS = {"USA", "UK", "India", "Canada"};

    public static Transaction generateTransaction(boolean fraud) {
        Random r = new Random();
        double amount = 5 + (5000 - 5) * r.nextDouble();
        String location = LOCATIONS[r.nextInt(LOCATIONS.length)];
        long account = 100000 + r.nextInt(900000);

        return new Transaction(amount, location, account, fraud);
    }

    public static List<Transaction> generateBatch(int count, double fraudRatio) {
        List<Transaction> list = new ArrayList<>();
        int fraudCount = (int)(count * fraudRatio);

        for (int i = 0; i < count - fraudCount; i++)
            list.add(generateTransaction(false));

        for (int i = 0; i < fraudCount; i++)
            list.add(generateTransaction(true));

        return list;
    }
}
