package Hackerrank;
//https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
import java.io.IOException;
import java.util.*;

public class Sherlock_and_the_Valid_String {
    static String isValid(String s) {
        if(s.isEmpty())
            return "YES";
        HashMap<Character,Integer>hashMap=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if (Character.isAlphabetic(s.charAt(i)) == true) {
                if (hashMap.containsKey(s.charAt(i))) {
                    int val = hashMap.get(s.charAt(i));
                    hashMap.put(s.charAt(i), val + 1);
                } else
                    hashMap.put(s.charAt(i), 1);
            }
            else
            return "NO";
        }
        int cnt=0;
        int max=0;
        for(int val:hashMap.values()){
            if(max<Collections.frequency(hashMap.values(),val))
                max=val;

        }
        System.out.println(max);

        int b=max;

        for(int val:hashMap.values()){
            if(val==b)
                continue;
            else if(val>b+1)
                return "NO";
            else if(val>b+1 && cnt==0 || val==b-1 && cnt==0|| val==1 && cnt==0|| val==b+1 && cnt==0)
                cnt++;
 //           else if(val==1)
   //             continue;
            else
                return "NO";
        }
        return "YES";

    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

//        String s = scanner.nextLine();

        String result = isValid("aabbc");
        System.out.println(result);//yes
         result = isValid("aabbccddeefghi");
        System.out.println(result);//no
        result = isValid("abcdefghhgfedecba");
        System.out.println(result);//yes
        result = isValid("aabbc");
        System.out.println(result);//yes
        result = isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd");
        System.out.println(result);//yes

    }

}
