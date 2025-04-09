import java.util.Scanner;

public class MathClassMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        System.out.printf("The absolute value is %d%n", Math.abs(num));
        
        System.out.print("Enter a floating-point number: ");
        double num1 = input.nextDouble();
        
        System.out.printf("The rounded value is %d%n", Math.round(num1));
        
        // Squared value using Math.pow()
        System.out.printf("The powered value is %.2f%n", Math.pow(num, 2));
        
        // Square root value using Math.sqrt()
        System.out.printf("The square root value is %.2f%n", Math.sqrt(num));
        
        System.out.println("=====================================================");
        
        // Finding the minimum of two numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        System.out.printf("The minimum number is %d%n", Math.min(number1, number2));
        
        // Finding the maximum of two numbers
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        
        System.out.print("Enter the fourth number: ");
        int number4 = input.nextInt();
        
        System.out.printf("The maximum number is %d%n", Math.max(number3, number4));
        
        // Generating a random number
        System.out.printf("The random number is %.2f%n", Math.random());
        
        System.out.println("=====================================================");
        
        // Calculating the area of a circle
        System.out.println("To calculate the area of a circle:");
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();
        
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area of the circle is %.2f%n", areaOfCircle);
    }
}

