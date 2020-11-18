package Hackerrank;

import java.io.*;
import java.util.*;
//https://www.hackerrank.com/challenges/maximum-element/submissions
public class Maximum_element {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan=new Scanner(System.in);
            Stack<Integer>st=new Stack<>();
            int n=scan.nextInt();
            int max=0;
            ArrayList<Integer>arr=new ArrayList<>();
            for(int k=0;k<n;k++){
                int q=scan.nextInt();
                if(q==1){
                    int val=scan.nextInt();
                    max=Math.max(max,val);
                    st.push(val);
                }
                else if(q==2){
                    int val=st.pop();
                    if(val==max) {
                        if(!st.isEmpty())
                        max = Collections.max(st);
                        else
                            max=0;
                    }

                }
                else
                    System.out.println(max);

            }
        }
}
