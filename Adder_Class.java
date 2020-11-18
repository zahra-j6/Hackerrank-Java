package Hackerrank;
import java.util.Scanner;

abstract class Calculator {
    abstract int add(int a, int b);
}

/*
 Write the Adder class here. Do not use an access modifier at the beginning of your class declaration.
 */
class Adder extends Calculator{

    @Override
    int add(int a, int b) {
        return a+b;
    }
}

public class Adder_Class {
    public static void main(String[] args) {
        int a, b;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextInt();
            b = scan.nextInt();
        }

        Calculator adderObject = new Adder();
        System.out.println("The sum is: " + adderObject.add(a, b));
    }
}
