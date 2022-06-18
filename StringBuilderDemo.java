package practice;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder ();
        sb.append ( "hello" );
        String s = sb.toString ();//StringBuilder转化为String类型
        System.out.println (s);
        String s1=new String (s);//String转化为StringBuilder
        System.out.println (s1);
    }
}
