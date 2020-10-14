import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sparse_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(); //N
		String k;
		List<String>l=new ArrayList<String>();
		for(int i=0;i<n;i++){
			k=scan.next();
			l.add(k);
		}
		int qn=scan.nextInt();
		List<String>ql=new ArrayList<String>();
		for(int i=0;i<qn;i++){
			k=scan.next();
			ql.add(k);
		}
		int j=0,sum=0;
		while(j!=qn){
			sum=0;
		for(int i=0;i<n;i++){
			if(l.get(i).equals(ql.get(j)))
				sum++;
		}
		System.out.println(sum);
		j++;
		}

	}

}
