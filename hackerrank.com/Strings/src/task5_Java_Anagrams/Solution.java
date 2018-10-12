package task5_Java_Anagrams;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
   public  static boolean isAnagram(String strA, String strB) {
        // Complete the function

        strA = strA.replaceAll("\\s+","").toLowerCase();
        strB = strB.replaceAll("\\s+","").toLowerCase();

        // Check every char of strA and removes first occurence of it in strB
        for (int i = 0; i < strA.length(); i++ ) {
            if (strB.equals("")) return false;  // strB is already empty : not an anagram
            strB = strB.replaceFirst(Pattern.quote("" + strA.charAt(i)), "");
        }

        // if strB is empty we have an anagram
        return strB.equals("");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

