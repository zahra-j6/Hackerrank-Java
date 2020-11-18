package Hackerrank;

import java.util.Arrays;

public class Rotation_Count {

        static void count(int arr[]){
        int n = arr.length;
        int min= Arrays.stream(arr).min().getAsInt();
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min)
                break;
            else
                cnt++;
        }

        System.out.println(cnt);
    }
    public static void main (String[] args){
        int arr[] = {15, 18, 2, 3, 6, 12};
        count(arr);//2
        arr =new int[] {7, 9, 11, 12, 5};
        count(arr);//4
        arr =new int[] {7, 9, 11, 12, 15};
        count(arr);//0

}
}
