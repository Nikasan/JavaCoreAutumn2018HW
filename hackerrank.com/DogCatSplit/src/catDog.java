import java.util.Scanner;

public class catDog {
    public static void main(String args[]) {
        int result=fac(3);
        System.out.println(result);
    }

    public static int fac(int number) {


        if (number <1) return  1;
       int prev= fac(number-1);
        int result = number*prev;

        return result;


    }
}

