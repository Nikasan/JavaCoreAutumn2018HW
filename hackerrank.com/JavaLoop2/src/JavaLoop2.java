import java.util.*;
public class JavaLoop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        in.close();

        int tempAnswer = 0;
        for (int i = 0; i < n; i++) {
            tempAnswer += (int)(Math.pow(2, i) * b);
            System.out.print(tempAnswer + a + " ");
        }
    }
}
