import java.util.*;

public class lengthOfLongestSubstringwithoutRepetition {

    public static int lengthOfLongest(String s) {
        HashSet<Character> table = new HashSet<>();
        int i = 0;
        int j = 0;
        int res = 0;
        while(j < s.length()){
            if(table.contains(s.charAt(j))){
                while(i < s.length() && s.charAt(i) != s.charAt(j)){
                    table.remove(s.charAt(i));
                    i++;
                }
                table.remove(s.charAt(i));
                i++;
            }
            table.add(s.charAt(j));
            res = Math.max(res, j - i + 1);
            j++;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longest_substring_length = lengthOfLongest(sc.next());
        System.out.println(longest_substring_length);
    }
}
