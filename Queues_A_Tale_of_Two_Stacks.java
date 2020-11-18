package Hackerrank;
//https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
import java.util.Scanner;
import java.util.Stack;
public class Queues_A_Tale_of_Two_Stacks {
    public static void main(String args[]) {
        Stack<Integer> queue = new Stack<>();
        int pointer = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.add(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.remove(0);
            } else if (operation == 3) { // print/peek
                System.out.println(queue.get(0));
            }
        }
        scan.close();
    }
}
