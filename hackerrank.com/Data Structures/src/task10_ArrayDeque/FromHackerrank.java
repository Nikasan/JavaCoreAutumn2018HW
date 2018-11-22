package task10_ArrayDeque;

import java.util.*;


public class FromHackerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }

        int max = 0;

        HashSet newSet = new HashSet();

        Object[] ob = deque.toArray();
        Integer[] dst = new Integer[m];
        for (int i = 0; i < n-m+1; i++) {
            System.arraycopy(ob,i, dst, 0, m);
            for (int j = 0; j < m; j++) {
                newSet.add(dst[j]);
            }
            max = newSet.size() > max ? newSet.size() : max;
        }
        System.out.println(max);
    }
}