 import java.util.Random; 

public class RandomClassGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        boolean option = random.nextBoolean();
        System.out.printf("Do you love Java? %b%n", option);

        int integerWithNoBound = random.nextInt();
        System.out.printf("The random number is %d%n", integerWithNoBound);

        int integerWithBound = random.nextInt(2000) + 1;
        System.out.printf("The random number is %d%n", integerWithBound);

        long randomLong = random.nextLong();
        System.out.printf("The random number is %d%n", randomLong);

        float randomFloat = random.nextFloat();
        System.out.printf("The random number is %f%n", randomFloat);

        double randomDouble = random.nextDouble();
        System.out.printf("The random number is %f%n", randomDouble);
    }
}