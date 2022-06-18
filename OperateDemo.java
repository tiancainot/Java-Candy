package practice;

public class OperateDemo {
    public static void  main(Str[] args){
        int i=10;
        int j=i++;//i加1，j没变，i先赋值给j，再自增。
        System.out.println("i="+i);
        System.out.println("j="+j);
        j=++i;//i，j都加1，i自增后，赋值给j。
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}
