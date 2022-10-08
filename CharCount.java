import java.util.Scanner;

public class CharCount {
   
  
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        getOccuringChar(S);
    }
    static void getOccuringChar(String s)
    {
        for (int i = 0; i < s.length(); i++) {
 
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) 
            {
                i++;
                count++;
            }
            System.out.print(s.charAt(i)+ "" + count);
        }
 
        System.out.println();
    }
}
