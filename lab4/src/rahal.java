public class rahal {
    public static void main(String[] args) {
        int a = 'b';
        char c1 = 'a', c2 = 98;
     System.out.println(c1);
     System.out.println(c2);
     System.out.println(++c2);
     System.out.println(a);
     System.out.println(Character.isDigit(c1));

      // two characters 

    char c4 = 'A', c5 = '4'; 

    System.out.println( Character.isDigit(c4)); 

    System.out.println( Character.isLetter(c4)); 

    System.out.println( Character.isLetterOrDigit(c5)); 

    System.out.println( Character.isLowerCase(c4)); 

    System.out.println( Character.isUpperCase(c4)); 

    System.out.println( Character.toLowerCase(c4)); 
   
        char ch=100;
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch+" is an uppercase letter");
        }
        else if (ch >= 'a'  && ch <= 'z') {
            System.out.println(ch+" is a lowercase letter");
        }
        else if (ch >= '0'  && ch <= '9') {
            System.out.println(ch+"is a is a numericcharacter");
        }

}
    
}
