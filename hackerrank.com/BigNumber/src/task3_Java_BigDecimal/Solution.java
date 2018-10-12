package task3_Java_BigDecimal;
import java.math.BigDecimal;
import java.util.*;

 class Solution {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        s = Arrays.asList(s).stream().filter(Objects::nonNull).sorted(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return new BigDecimal(s2).compareTo(new BigDecimal(s1));
            }}).toArray(size -> new String[size]);


        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}