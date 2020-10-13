package Hackerrank;//https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Alternating_Char {

    // Complete the maximumToys function below.
    static int alternatingCharacters(String s) {
        String arr[]=s.replace("[\\s]"," ").split("");
        int cnt=arr.length-1,del=0,i=0;
        while (cnt!=0){
            if(arr[i].equals(arr[i+1])){
                arr[i]="";
                cnt--;
                i++;
                del++;
            }else{
                cnt--;
                i++;
            }
        }
        return del;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0) {
            String s=sc.next();


            int result = alternatingCharacters(s);
            System.out.println(result);
            t--;
        }
    }
}
