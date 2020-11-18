package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-anagrams/submissions/code/22769069
public class Java_Anagrams {
    static boolean isAnagram(String a, String b) {

        // Complete the function by writing your code here.
        char a1[]=a.toLowerCase().toCharArray();
        char b1[]=b.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);

        return Arrays.equals(a1,b1);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
