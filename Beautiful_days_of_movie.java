https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

package Hackerrank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Beautiful_days_of_movie {

        // Complete the beautifulDays function below.
        static int beautifulDays(int i, int j, int k) {
            int cnt=0;
            while(i<=j){
                int num=i,rem=0;
                while(num!=0){ // reversing the digits
                    rem=rem*10+num%10;
                    num=num/10;
                }
                if(((i-rem)%k)==0) // if remainder is 0 means it is completely divisible and hence beautiful number
                    cnt++;
                i++;
            }
            return cnt;


        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            System.out.println(beautifulDays(20,23,6));

        }
    }

