package task4_Java_String_Reverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rts = new StringBuilder(str).reverse().toString();

        System.out.println(((str.compareTo(rts) == 0)) ? "Yes" : "No");
    }
}
