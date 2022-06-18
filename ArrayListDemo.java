package practice;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<> ();
        s.add ( "hello" );
        s.add ( "world" );
        s.add ( "Java" );
        s.add ( 0,"你好Java" );
        System.out.println (s);
        s.remove ( 0 );//删除0索引处值
        System.out.println (s);
        s.set ( 2,"Java!" );//修改2索引处值
        System.out.println (s.get ( 2 ));//查看2索引处值
        System.out.println (s.size ());//返回元素个数
        System.out.println (s);
    }
}
