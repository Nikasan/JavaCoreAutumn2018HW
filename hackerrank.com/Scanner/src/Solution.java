import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input Int:");
        int i = scan.nextInt();

        System.out.println("Input Double:");
        double d = scan.nextDouble();

        scan.nextLine();

        System.out.println("Input String:");
        String s = scan.nextLine();

        scan.close();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();

    }
}