<<<<<<< HEAD
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Multiplication Table of " + number);

        
        int i = 1;
        while (i <= 12) { 
            System.out.printf("%d x %d = %d%n", number, i, number * i);
            i++; 
        }
    }
}
=======
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Multiplication Table of " + number);

        
        int i = 1;
        while (i <= 12) { 
            System.out.printf("%d x %d = %d%n", number, i, number * i);
            i++; 
        }
    }
}
>>>>>>> ceff0811524af1db9ab589ac8ffb4f1ca8680f66
