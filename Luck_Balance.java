package Hackerrank;//https://www.hackerrank.com/challenges/luck-balance/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Luck_Balance {

    // Complete the maximumToys function below.
    static int luckBalance(int k, int[][] contests) {
        int luck=0,cnt=1;
        ArrayList<Integer>arr=new ArrayList<>();
        for (int j=0;j<contests.length;j++) {
            if (contests[j][1] == 0) {
                luck = luck + contests[j][0];

            }else
                arr.add(contests[j][0]);
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        int i=0;
        while(cnt<=k && !arr.isEmpty()){
            luck=luck+arr.get(i);
            arr.remove(i);
            cnt++;
        }
        if(arr.isEmpty())
            return luck;
        else {
            for (i = 0; i < arr.size(); i++) {
                luck = luck - arr.get(i);
            }
            return luck;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[][] contests = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                int contestsItem = sc.nextInt();
                contests[i][j] = contestsItem;
            }
        }



        int result = luckBalance(k, contests);;
            System.out.println(result);


    }
}
