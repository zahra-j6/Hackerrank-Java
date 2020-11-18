package Hackerrank;

import java.util.Scanner;
import java.util.Stack;
//https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
public class Queue_using_Two_Stacks {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> st=new Stack<>();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int q=scan.nextInt();
            if(q==1)
                st.push(scan.nextInt());
            else if(q==2)
                st.removeElementAt(0);
            else
                System.out.println(st.get(0));
        }
    }
}
