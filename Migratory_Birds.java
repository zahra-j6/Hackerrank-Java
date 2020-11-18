package Hackerrank;

//https://www.hackerrank.com/challenges/migratory-birds/submissions
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

 class Migratory_Birds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            int val=arr.get(i);
            if(hmap.containsKey(val))
            {
                int v=hmap.get(val);
                hmap.put(val,v+1);
            }
            else
                hmap.put(val,1);
        }
        int key=  Collections.max(hmap.entrySet(), HashMap.Entry.comparingByValue()).getKey();
        return key;



    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);

         }
}

