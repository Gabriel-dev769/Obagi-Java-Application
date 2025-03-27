import java.util.Scanner;

public class Numbercalculus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum6to8 = 0, sum4to9 = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            numbers[i] = input.nextInt();
        }

        
        for (int i = 5; i <= 7; i++) sum6to8 += numbers[i]; 
        for (int i = 3; i <= 8; i++) sum4to9 += numbers[i]; 

        
        System.out.printf("Result of the number calculations is: %d%n", sum4to9 - sum6to8);
        
        
    }
}
