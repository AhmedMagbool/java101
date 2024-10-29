import java.util.Scanner;
public class lab {
    public static void main(String[] args) {
        // for (int i = 10; i >= 0; i--) {
        //     System.out.println(i);
        // }
        Scanner a = new Scanner(System.in);
        int digits = a.nextInt();
        System.out.println("Enter 4 digits");
        int n=digits , rev = 0 ,r, ornum=digits ;
        while (digits>0) {
         r=digits%10;
        //  rev=rev*10+r;
        digits=digits/10;
         int sum = r+r;
         System.out.println(sum);

        }

        if (rev==ornum) {
            System.out.println("plaindrom");
        } else {
            System.out.println("Not plaindrom");
        }          

        System.out.println(rev);

        

    }
}
