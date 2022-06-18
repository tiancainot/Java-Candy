package practice;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        String s = sc.next ();
        String s2 = Reverse ( s );
        System.out.println (s2);

        /*StringBuilder s=new StringBuilder ();
        //链式编程
        StringBuilder a=s.append ( "hello" ).append ( "world" ).append ( 100 );
        System.out.println (s);
        StringBuilder reverse = s.reverse (  );
        System.out.println (s);
        System.out.println (reverse);*/
    }
    public static String Reverse(String s){
        StringBuilder sb=new StringBuilder (s);
        StringBuilder sb1 = sb.reverse ();
        String s1 = sb1.toString ();
        return s1;
    }
}
/*
public class StringReverse {
    public static void main(String[] args) {
        String s = "abc";
        String reverse = "";
        for (int i = 0; i < s.length (); i++) {
            reverse = s.charAt ( i ) + reverse;//倒序相加
        }
        System.out.println ( reverse );
    }
}
*/
/*
        Scanner sc=new Scanner ( System.in);
        String s = sc.nextLine ();
        String r = reverse (s);
        System.out.println (r);
    }
    public static String reverse(String s){
        String ss="";
        //倒序遍历
        for (int i=s.length()-1;i>=0;i--){
            ss+=s.charAt ( i );
        }
        return ss;
    }
}
*/
