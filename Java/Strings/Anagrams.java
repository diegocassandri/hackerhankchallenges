/*
Two strings AA and BB are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".

Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not. The strings may consist at most 50 english characters, the comparison should NOT be case sensitive.

This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.

Sample Input 1
anagram
margana

Sample Output 1:
Anagrams
*/

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        char c = 0;
        
        for(char cs : a.toLowerCase().toCharArray()) c ^= cs;
        
        for(char ct : b.toLowerCase().toCharArray()) c ^= ct;
        
        return c == 0?true:false;
    }

    static boolean isAnagram2 (String a, String b) { 
        
        a = a.toLowerCase(); 
        b = b.toLowerCase();
  
        char [] str1 = a.toCharArray();
        char [] str2 = b.toCharArray();
    
        java.util.Arrays.sort(str1);
        java.util.Arrays.sort(str2);
    
        if (java.util.Arrays.equals(str1, str2)){
            return true;
        }
        return false;
    
    
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
