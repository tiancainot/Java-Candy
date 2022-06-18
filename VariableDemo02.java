package practice;

public class VariableDemo02 {
    public static void main(Str[] args){
        long l=10000000000L;//默认int类型，整数过大，不能输出，加一个L才表示long类型。
        System.out.println(l);
        float f=13.14f;//防止类型不兼容，加f。
        System.out.println(f);
            int a=6;
            int b=4;
            System.out.println(a%b);//取余
            System.out.println(a/b);//输出1
            System.out.println(6.0/4);//输出1.5，想得到小数，必须有浮点数参与。
    }
}


