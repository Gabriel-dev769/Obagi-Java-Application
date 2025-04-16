import java.util.Random;

public class RandomAccountNumber {
    public static void main(String[] args) {
        Random random = new Random();

        
        long accountNumber = (long)(random.nextDouble() * 1_000_000_0000L);

        System.out.printf("Generated Account Number: %010d%n", accountNumber);
    }
}
