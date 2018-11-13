package task5_List;

import java.util.*;

public class ListLearner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input count of elements");
        int n = scanner.nextInt();
        LinkedList<Integer> mylist = new LinkedList<Integer>();
        for (int i=0; i<n; i++){
            mylist.add(scanner.nextInt());
        }
        System.out.println(mylist);




        System.out.println("Input Insert or Delete");
        Scanner input = new Scanner(System.in);
        String line = input.next();

        if (line.equals("Insert")){

            int x = input.nextInt();
            int y=input.nextInt();
            mylist.add(x,y);
            System.out.println(mylist);
        } else
            if (line.equals("Delete")){
                System.out.println("Input index x for delete");
                int x = input.nextInt();
                mylist.remove(x);
                System.out.println(mylist);
            }


    }
}
