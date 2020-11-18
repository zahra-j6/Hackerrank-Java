package Hackerrank;
//https://www.hackerrank.com/challenges/min-max-riddle/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
//3 testcases failing due to TLE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Min_Max_Riddle {
    static long[] riddle(int[] arr) {
        int max=0;
       for(long val:arr)
           max= (int) Math.max(max,val);
       long res[]=new long[arr.length];
       res[0]=max;
       int k=1;
       for(int i=2;i<=arr.length;i++){

           ArrayList<Integer>helper=new ArrayList<>();
           for(int j=0;j<= arr.length-i;j++){
               int[] h=Arrays.copyOfRange(arr,j,j+i);
               //create a new arr having element j to i+j
               int min=Arrays.stream(h).min().getAsInt();
               helper.add(min);
           }
           res[k]=Collections.max(helper);
           k++;

       }
       return res;

    }
    public static void main(String[] args){
        int arr[]={1, 2, 3, 5, 1, 13, 3};
        long[] res = riddle(arr);
        System.out.println(Arrays.toString(res));
        arr=new int[]{3, 5, 4, 7, 6, 2};
        res = riddle(arr);
        System.out.println(Arrays.toString(res));


    }

}
