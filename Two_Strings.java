package Hackerrank;

public class Two_Strings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2,String p) {
            for(int i=0;i<s2.length();i++){
                if(s1.indexOf(s2.charAt(i))>-1)
                    return "YES";
        }
        return "NO";


    }


    public static void main(String[] args)  {
        String result = twoStrings("hello", "world","");//y
        System.out.println(result);

         result = twoStrings("hi", "world","");//n
            System.out.println(result);

}

}
