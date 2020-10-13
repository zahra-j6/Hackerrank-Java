package Hackerrank;//https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Mark_and_Toys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        Arrays.sort(prices);
        for(int i=0;i< prices.length;i++){
            int val=k-prices[i];
            int sum=1;
            int j=i;
            for( j=j+1;j<prices.length;j++){
                if(val<=0)
                    break;
                else{
                    val=val-prices[j];
                    sum++;
                }
            }
            arr.add(sum-1);
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        return arr.get(0);



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        int prices[]=new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maximumToys(prices, k);
        System.out.println(result);
    }
}
