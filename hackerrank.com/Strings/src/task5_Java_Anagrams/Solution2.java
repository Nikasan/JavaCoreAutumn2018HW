package task5_Java_Anagrams;

import java.util.Scanner;

import static task5_Java_Anagrams.Solution.isAnagram;

public class Solution2 {
    private static boolean isAnagram(String stringOne, String stringTwo) {
        char[] first = stringOne.toLowerCase().toCharArray();
        char[] second = stringTwo.toLowerCase().toCharArray();
        // if length of strings is not same
        if (first.length != second.length) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < first.length; i++) {
            counts[first[i] - 97]++;
            counts[second[i] - 97]--;
        }
        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0) {
                return false;
            }
        }
        return true;
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