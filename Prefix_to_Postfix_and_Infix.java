package Hackerrank;

import java.util.Stack;

public class Prefix_to_Postfix_and_Infix {
    static String infix(String str){
        String res="";
        Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='*' ||str.charAt(i)=='+' ||str.charAt(i)=='-' ||str.charAt(i)=='/' )
                    st.push(str.charAt(i));
            else
                res=res+str.charAt(i)+st.pop();
        }
        res=res+str.charAt(str.length()-1);
        return res;
    }
    static boolean isOperator(char x)
    {
        switch (x) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }

    // Convert prefix to Postfix expression
    static String postfix(String pre_exp)
    {

        Stack<String> s = new Stack<String>();

        // length of expression
        int length = pre_exp.length();

        // reading from right to left
        for (int i = length - 1; i >= 0; i--)
        {
            // check if symbol is operator
            if (isOperator(pre_exp.charAt(i)))
            {
                // pop two operands from stack
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();

                // concat the operands and operator
                String temp = op1 + op2 + pre_exp.charAt(i);

                // Push String temp back to stack
                s.push(temp);
            }

            // if symbol is an operand
            else {
                // push the operand to the stack
                s.push(pre_exp.charAt(i) + "");
            }
        }

        // stack contains only the Postfix expression
        return s.peek();


}


    public static void main(String args[]) {
        System.out.println(infix("*+AB-CD"));//A+B*C-D
        System.out.println(postfix("*+AB-CD"));//AB+CD-
        System.out.println(infix("*-A/BC-/AKL"));//A-B/C*A/K-L
        System.out.println(postfix("*-A/BC-/AKL"));

    }
}