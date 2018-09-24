import java.util.*;

public class SumDouble {
    public static int sumDouble(int first, int second) {
        int result = first + second;
        if (first == second) {
            result = result * 2;
        }
        return result;
    }

    public static int calculateSum(int first, int second) {
        int result = first + second;
        if (first == second) {
            result = result * 2;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Enter a positive integer a: ");
        a = in.nextInt();
        System.out.print("Enter a positive integer b: ");
        b = in.nextInt();
        int sum1 = SumDouble.calculateSum(a, b);
        int sum2 = SumDouble.sumDouble(a, b);

        System.out.println("Sum1 of digits: " + sum1);
        System.out.println("Sum2 of digits: " + sum2);
    }
}