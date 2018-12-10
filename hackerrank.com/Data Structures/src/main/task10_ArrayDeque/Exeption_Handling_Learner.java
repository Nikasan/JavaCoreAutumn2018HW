package task10_ArrayDeque;
import java.io.*;
import java.util.*;

public class Exeption_Handling_Learner {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            try {
                int x = scan.nextInt();
                int y = scan.nextInt();
                System.out.println(x/y);
            } catch (InputMismatchException e) {
                System.out.println(e.getClass().getName());
            } catch (ArithmeticException e) {
                System.out.println(e.getClass().getName() + ": / by zero");
            }
        }
    }
