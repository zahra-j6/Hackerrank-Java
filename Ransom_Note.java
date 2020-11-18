package Hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
//https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=dictionaries-hashmaps
public class Ransom_Note {
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<String,Integer>hm=new Hashtable<>();
        for(int i=0;i<magazine.length;i++){
            if(hm.containsKey(magazine[i])){
                int val=hm.get(magazine[i]);
                hm.put(magazine[i],val+1);
            }else
                hm.put(magazine[i],1);
        }
        for(int i=0;i<note.length;i++){
            if(hm.containsKey(note[i])){
                int val=hm.get(note[i]);
                if(val>0)
                    hm.put(note[i],val-1); // if note has the word twice but magazine has the word once
                else{
                    System.out.println("No");
                    return;
                }
            }else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");


    }


    public static void main(String[] args) {
        String magazine[]={"give","me", "one", "grand","today", "night"};
        String note[]={"give", "one", "grand","today"};
        checkMagazine(magazine, note);//y
        magazine=new String[]{"ive" ,"got", "a", "lovely" ,"bunch" ,"of", "coconuts"};
        note=new String[]{"ive","got","some","coconuts"};
        checkMagazine(magazine, note);//n
        magazine=new String[]{"two", "times", "three" ,"is", "not", "four"};
        note=new String[]{"two", "times", "two" ,"is",  "four"};//n
        checkMagazine(magazine, note);//n

    }
}
