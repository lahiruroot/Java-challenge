import java.util.Scanner;
public class StringIsAPalindromeOrNot {	
    public static void main(String[] args) {		
     Scanner sc =new Scanner(System.in);		 
     System.out.println("Enter string");		
     String s = sc.next();		
     String rev = "";
     System.out.println(s.charAt(3));
     for (int i = s.length()-1; i >=0 ; i--) 			
     rev=rev+s.charAt(i);		
     if(s.equals(rev))			
     System.out.println("String is palindrome");		
     else 			
     System.out.println("String is not palindrome");	
    }
}
