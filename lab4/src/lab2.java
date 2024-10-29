import java.util.Scanner;
public class lab2 {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner a = new Scanner(System.in);

        int num = input1.nextInt();
        System.out.println("enter any letter you want");
        // System.out.println("Enter a num you want it to be sqart");
        // int x = Math.max(2, 3);
        // double y = Math.min(2.5, 4.6);
        // System.out.println("x="+x+"y="+y);
        // double sqart = Math.sqrt(num);
        // System.out.println("sqart="+sqart);
        // int abs = Math.abs(num);
        // System.out.println("abs="+abs);
        // double random = Math.random();
        // System.out.println("random num="+random);
        // String mesgge = "welcome to java";
        // System.out.println("The length of " + mesgge + " is "+ mesgge.length());
        // double power = Math.pow(2, 3);
        // System.out.println("The 2 power 3= "+power);
        // System.out.println("Riyadh"+"Dammam");
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.print("Enter a number: ");
        int number = a.nextInt(); 
        
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; 
        }
        
        System.out.println("The factorial of " + number + " is: " + factorial);
        
        a.close(); 
    }
}