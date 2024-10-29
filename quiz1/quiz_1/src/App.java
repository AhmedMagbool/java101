import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner num1 = new Scanner(System.in);
    System.out.println("enter num1");
    int num_1 = num1.nextInt();
    Scanner num2 = new Scanner(System.in);
    System.out.println("enter num2");
    int num_2 = num2.nextInt();
    Scanner num3 = new Scanner(System.in);
    System.out.println("enter num3");
    int num_3 = num3.nextInt();

    if (num_1 > num_2 && num_1>num_3) {
        System.out.println("num1 greatest");
    }else if (num_2>num_1 && num_2>num_3) {
        System.out.println("num2 greateast");
    }else if (num_3>num_1 && num_3>num_2) {
        System.out.println("num3 greatest");
    }else{
        System.out.println("eror");
    }
    }

   
}
