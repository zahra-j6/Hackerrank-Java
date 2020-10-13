package Hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Array_DS_2D {
    static int hourglassSum(int[][] arr) {
            ArrayList sum = new ArrayList();
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    sum.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
                }
            }
            int val= (int) Collections.max(sum);

            return val;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    //    int t= sc.nextInt();
        int[][]arr = new int[6][6];
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
//                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = sc.nextInt();
                }
            }


        int result = hourglassSum(arr);
            System.out.println(result);


    }
}