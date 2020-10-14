import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class countingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
                int steps=0;
        int v=0;
        boolean found=false;
        for(int j=0;j<s.length();j++) {
            
            found=false;
        if(steps==0 && s.charAt(j)=='D') {
            
            while(found!=true) {// &&steps==0 &&s.charAt(i)=='D') {
        //    for(int i=j;i<s.length();i++) {
                if(s.charAt(j)=='D')
                    steps--;
                else if(s.charAt(j)=='U')
                    steps++;
                if(steps==0) {
                    v++;
                    found=true;
                    j--;
                }
                j++;
                
            }
        }
            
        else {
//             while(found==false) {
               
            if (s.charAt(j)=='D') {
                steps--;
            }else
                steps++;
             }
        }            
        
        return v;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
