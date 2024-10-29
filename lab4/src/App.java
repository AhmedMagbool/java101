import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //     Scanner input1 = new Scanner(System.in); 
    //    System.out.println("Enter your Grade");
    //     int marks = input1.nextInt();
        
    //     if (marks > 95 && marks<= 100) {
    //         System.out.println("A+");
    //     }
    //     else if (marks > 90 && marks<= 95) {
    //         System.out.println("A");
    //     }
    //     else if (marks > 85 && marks<= 90) {
    //         System.out.println("B+");
    //     }
    //     else if (marks > 80 && marks<= 85) {
    //         System.out.println("B");
    //     }
    //     else if (marks > 75 && marks<= 80) {
    //         System.out.println("C+");
    //     }
    //     else if (marks > 70 && marks<= 75) {
    //         System.out.println("C");
    //     }
    //     else if (marks > 65 && marks<= 70) {
    //         System.out.println("D+");
    //     }
    //     else if (marks > 60 && marks<= 65) {
    //     System.out.println("D");
    //      }else {
    //     System.out.println("F");
 
    //     }
    
    //     Scanner input2 = new Scanner(System.in); 
    //     System.out.println("Enter Any Num");
    //      int num = input2.nextInt();
    //     if (num % 2 == 0) {
    //        System.out.println("Num is Even"); 
    //     } else {
    //         System.out.println("Num is Odd");   
    //     }
       
        //using For loop
        for (int a = 2; a <= 20; a+=2){
            System.out.println(a);

        } 
        int s = 1;
         //using while loop
        while ( s <= 10 ) {
            System.out.println(s);
            s++;
        }
        //using dowhile loop
        int m = 1;
        do {
          System.out.println(m);
          m++;  
        } while (s <= 10);
    }
}
