import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger sum =a.add(b);
        System.out.println(sum);
        BigInteger mult = a.multiply(b);
        System.out.println(mult);
        scanner.close();
    }
}