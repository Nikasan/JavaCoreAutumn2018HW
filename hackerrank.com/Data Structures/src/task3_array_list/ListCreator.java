package task3_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class ListCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer>  mylist  = new ArrayList<>();
         for (int i=0; i<n; i++){
             mylist.add(scanner.nextInt());
         }
        System.out.println(mylist);
        System.out.println("Input index:");
        System.out.println(mylist.get(scanner.nextInt()));

        mylist.remove(2);
        System.out.println("After remove second item");
        System.out.println(mylist);


        }

    }
