public class WhileLoopStatement {
    public static void main(String[] args) {
        int num = 50; // Value to print repeatedly
        
        int i = 1; // Initialization expression
        
        // While loop to iterate 10 times
        while (i <= 10) {
            System.out.printf("%d%n", num); 
            // '%n' is the correct line break specifier
            
            i++; // Increment expression to avoid infinite loop
        }
    }
}
