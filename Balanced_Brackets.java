package Hackerrank;
//https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/*
A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.
 */

public class Balanced_Brackets {
    static String isBalanced(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
                stack.add(ch);
            else if (ch==')'||ch=='}'||ch==']'){
                if(stack.isEmpty())
                    return "NO";
                char val=stack.pop();
                if (ch==')' && val=='(' || ch=='}' && val=='{' || ch==']' && val=='[')
                    continue;
                else
                    return "NO";

            }else
                return "NO";
        }
        if(stack.isEmpty())
        return "YES";
        else
            return "NO";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.next();

            String result = isBalanced(s);
            System.out.println(result);
        }
    }

}
