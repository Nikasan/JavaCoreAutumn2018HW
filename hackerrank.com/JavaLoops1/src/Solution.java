import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input N");
        int N = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result = N * i;
            System.out.println(N + "x" + i + "=" + result);
        }
        scanner.close();
    }
}

// second solution:
//public class Solution {
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int N = scanner.nextInt();
//        for(int i=1;i<=10;i++){
//
//            System.out.printf("%d x %d = %d%n" ,N,i,N*i );
//
//        }
//        scanner.close();
//    }
//}
