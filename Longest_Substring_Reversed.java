package Hackerrank;

import java.io.*;
import java.util.*;

public class Longest_Substring_Reversed {
        static int max=0;
        static void Utils(String s, char arr[], int st, int end, int index,int m ){
            if(index==m) {
                String res="";
                for (int i = 0; i < m; i++)
                    res=res+arr[i];
                String rev="";
                for(int i=res.length()-1;i>=0;i--)
                    rev=rev+res.charAt(i);
                if(s.contains(rev) && rev.length()>max) {
                    int begin=s.indexOf(rev.charAt(0));
                    int b2=s.lastIndexOf(res.charAt(res.length()-1));
                    if(b2!=begin)
                        max = rev.length();
                }

            }
            else{
                for(int i=st;i<=end && end-i+1>=(m-index);i++){
                    arr[index]=s.charAt(i);
                    Utils(s,arr,i+1,end, index+1,m);

                }
            }

        }
        static void combi(String str){
            char arr[]=new char[str.length()*str.length()];
            for(int r=0;r<str.length();r++)
                Utils(str, arr,0, str.length()-1,0,r);
            System.out.println(max);
        }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan=new Scanner(System.in);
            String s=scan.nextLine();
            combi(s);
        }
    }