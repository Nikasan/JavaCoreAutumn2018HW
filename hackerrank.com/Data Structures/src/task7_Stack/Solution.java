package task7_Stack;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        /* Create HashMap to match opening brackets with closing brackets */
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        /* Test each expression for validity */
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false" );
        }
        scan.close();
    }

    private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
        if ((expression.length() % 2) != 0) {
            return false; // odd length Strings are not balanced
        }
        ArrayDeque<Character> deque = new ArrayDeque<>(); // use deque as a stack
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}
//Class ArrayDeque<E>
//java.lang.Object
//java.util.AbstractCollection<E>
//java.util.ArrayDeque<E>

//pop()
//Pops an element from the stack represented by this deque.
//push(E e)
//Pushes an element onto the stack represented by this deque.