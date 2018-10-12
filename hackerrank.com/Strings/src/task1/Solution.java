package task1;
import java.util.*;
import java.lang.*;
public class Solution {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int sum = str1.length() + str2.length();

        System.out.println(sum);

        if (str1.compareTo(str2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
        System.out.println(str1 + " " + str2);
    }
}

