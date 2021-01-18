import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Drawing_Book {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        
         int first_page=0, last_page=n;
         if(n%2==0 && n-p==1&&p!=1) //when last page is even and we want to open the odd page before it
            return 1;
         return Math.min((int)Math.ceil((p-first_page)/2),(int) Math.ceil((last_page-p)/2)); 
         //finding the number of pages starting from 1 and number of pages starting from n
         
         

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
