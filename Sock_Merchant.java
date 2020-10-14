//package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Sock_Merchant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int c_i = 0; c_i < n; c_i++) {
			c = in.nextInt();
			a.add(c);
		}
		int k=n;
		int cnt = 0;

		for (int i = k; i >0; i--) {

			for (int j = 0; j <= k; j++) {
				if (i == j) {
				//System.out.println("Same");
				}
				else{
				//	System.out.println("i is "+i+" j is "+j);
					try {
						if (a.get(i) == (a.get(j))) {
						//	System.out.println("Removing..."+a.get(j)+"-------"+a.get(j));
							cnt++;

							a.remove(i);
							a.remove(j);
							n = n - 2;

							break;

						}
					} catch (Exception e) {

					}
				
				}
			}

		}

		System.out.println(cnt);

	}
}
