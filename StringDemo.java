package practice;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        char[] chs={'a','b','c'};
        String s1=new String (chs);
        String s2=new String (chs);
        String s3="abc";
        String s4="abc";
        Scanner sc=new Scanner ( System.in );
        String s5=sc.nextLine ();
        /*
        //比较地址
        System.out.println (s1==s2);
        System.out.println (s1==s3);
        System.out.println (s3==s4);
        //比较内容
        System.out.println (s1.equals ( s2 ));
        System.out.println (s1.equals ( s3 ));
        System.out.println (s3.equals ( s4 ));
*/
//        System.out.println (s3.charAt ( 0 ));
//        System.out.println (s3.charAt ( 1 ));
//        System.out.println (s3.charAt ( 2 ));
        for (int i=0;i<s5.length ();i++){
            System.out.println (s5.charAt ( i ));
        }
    }
}
