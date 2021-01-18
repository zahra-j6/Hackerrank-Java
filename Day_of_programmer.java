//https://www.hackerrank.com/challenges/day-of-the-programmer/problem

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

public class Day_of_programmer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        String day="";
        if(year==1918) //No calendar specified for this year 
            return "26.09.1918"; 
        if(year>1918){ //Gregorian calender
          if(year%400==0 || (year%4==0 && year%100!=0)) { //leap year
              day="12.09."+String.valueOf(year);
          }else{
              day="13.09."+String.valueOf(year);
              
          }
        }else{//Julian calender
            if(year%4==0) { //leap year
              day="12.09."+String.valueOf(year);
          }else{
              day="13.09."+String.valueOf(year);
              
          }
        }

        return day;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
