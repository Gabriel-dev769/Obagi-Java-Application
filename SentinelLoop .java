import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int sum = 0;
        double average;
        long product = 1;

        System.out.println("Enter -1 to mark end of input");

        while (true) {
            System.out.print("Enter number: ");
            int num = input.nextInt(); 

            if (num == -1) {
                break; 
            }
            sum += num;  
            product *= num; 
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
