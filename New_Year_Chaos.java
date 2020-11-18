package Hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays
public class New_Year_Chaos {
    public static void minimumBribes(int op[]) {
        int bribe = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < op.length; i++)
            arr.add(i + 1);

        for (int i = 0; i < op.length; i++) {
            if (op[i] == arr.get(i))
                continue;
            else {
                Collections.swap(arr, i, i + 1);
                bribe++;
                if (op[i] == arr.get(i))
                    continue;
                else {
                    Collections.swap(arr, i, i + 2);
                    bribe++;
                    if (op[i] == arr.get(i))
                        continue;
                    else {
                        System.out.println("Too chaotic");
                        return;
                    }
                }

            }
        }
        System.out.println(bribe);
    }



    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0) {
            int n = sc.nextInt();
            int[]q = new int[n];
            for (int i = 0; i < n; i++) {
                    int contestsItem = sc.nextInt();
                    q[i] = contestsItem;
            }


            minimumBribes(q);
            t--;
        }

    }
}
