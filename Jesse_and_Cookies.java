package Hackerrank;

import java.util.*;
import java.util.stream.IntStream;


//https://www.hackerrank.com/challenges/jesse-and-cookies/problem
public class Jesse_and_Cookies {
    static int cookies(int k, int[] A) {
        /*
         * Write your code here.
         */
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:A)
            pq.add(i);
        int cnt=0;
        while(pq.peek()<k){
            if(pq.size()>1) {
                cnt++;
                int f=pq.poll();
                int s=pq.poll();
                pq.add((1 * f) + (2 * s));
                //size--;
                if (pq.peek()> k)
                    break;
            }else
                return -1;

        }
    return cnt;
    }
//        return cnt;

   // }


    public static void main(String[] args)  {
        int A[]={1 ,2, 3, 9, 10, 12};//2
        int result = cookies(7, A);
        System.out.println(result);
        A=new int[]{1,1,1};
        result = cookies(10, A);
        System.out.println(result);//-1


    }
}

