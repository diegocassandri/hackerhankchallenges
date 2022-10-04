import java.io.*;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        String reverse = new StringBuilder(A).reverse().toString();
        
        System.out.println((A.equals(reverse)) ? "Yes" : "No");  
        
        //if (A == A.reverse) ? System.out.println("Yes") : System.out.println("No");
        
    }
}



