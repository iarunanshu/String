import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static final int CHAR=256;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the original string");
        String s1=sc.nextLine();
        System.out.println("enter the anagram string");
        String s2=sc.nextLine();
        //System.out.println(areanagram(s1,s2));
        System.out.println(areanagramefficient(s1,s2));

    }

    public static boolean areanagram(String s1,String s2){
        char a1[]=s1.toCharArray();
        Arrays.sort(a1);
        s1=new String(a1);
        char a2[]=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);
        return s1.equals(s2);
    }
    public static boolean areanagramefficient(String s1,String s2) {
        int count[]=new int[CHAR];
        if (s1.length()!=s2.length()) {
            return false;
        }
        for(int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0)
            return false;
        }
        return true;
    }
}
