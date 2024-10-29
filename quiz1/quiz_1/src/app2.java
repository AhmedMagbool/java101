import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter num");
        int number = num.nextInt();
        int sum = 0;      
        while (number > 0) {
            sum += number % 10; 
            number /= 10;       
        }
        System.out.println(sum);
    }
}
