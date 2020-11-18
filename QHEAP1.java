package Hackerrank;

import java.util.PriorityQueue;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/qheap1/problem
public class QHEAP1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int q=0;
        for(int i=0;i<n;i++){
            q=scan.nextInt();
            if(q==1){
                pq.add(scan.nextInt());
            }else if(q==2){
                pq.remove(scan.nextInt());
            }else{
                System.out.println(pq.peek());
            }
        }
    }
}
