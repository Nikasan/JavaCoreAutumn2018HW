import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StringFormatter formatter = new StringFormatter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.println("Input String:");
            String input = scanner.nextLine();

            System.out.println("Input Int:");
            int number = scanner.nextInt();
            formatter.printString(input, number);
        }
        System.out.println("================================");

        scanner.close();
    }
}