import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  
        
    System.out.println("Enter two numbers:");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    
    System.out.println("Choose an operation: +, -, *, /");
    char operation = input.next().charAt(0);  // Read the arithmetic operation symbol

    switch (operation) {
        case '+':
            int sum = num1 + num2;
            System.out.println("Result: " + num1 + " + " + num2 + " = " + sum);
            break;
            
        case '-':
            int diff = num1 - num2;
            System.out.println("Result: " + num1 + " - " + num2 + " = " + diff);
            break;
            
        case '*':
            int mul = num1 * num2;
            System.out.println("Result: " + num1 + " * " + num2 + " = " + mul);
            break;
            
        case '/':
            // Check for division by zero
            if (num2 != 0) {
                double div = (double) num1 / num2;
                System.out.println("Result: " + num1 + " / " + num2 + " = " + div);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
            break;
            
        default:
            System.out.println("Please enter a valid operation: +, -, *, /");
    }
}
}