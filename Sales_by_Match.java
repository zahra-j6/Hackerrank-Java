package Hackerrank;
//https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Sales_by_Match {
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(ar[i])){
                int val=hm.get(ar[i]);
                hm.put(ar[i],val+1);
            }else
                hm.put(ar[i],1);
        }
        int cnt=0;
        for(int v:hm.values()){
            int r=v/2;
            System.out.println("for value "+v+" r is "+r);
            cnt+=r;
        }
        return cnt;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


