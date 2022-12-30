package day03;

public class OperDemo {
    public static void main(String[] args) {
        /*
        int a = 5,b = 6;
        int c = a++;//++在后，先传值再自加
        int d = ++b;//++在前，先自加再传值
        //无论在前在后，本身都会做+1的操作
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int a1 = 5,b1 = 5;
        int c1 = a1--;
        int d1 = --b1;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
         */
        /*
        int a = 5,b = 10,c=5;
        System.out.println(a>c);//false
        System.out.println(a>=c);//true
        System.out.println(a>b);//false
        System.out.println(a<=b);//true
        System.out.println(a+c==b);//true
        System.out.println(a+c>=b);//true
        System.out.println(a++>c);//false
        System.out.println(a++>c);//true
        System.out.println(a);//7
        System.out.println(b>c?"b大":"c大");

        System.out.println(a<b&&b>c);//true
        System.out.println(a>b&&b>c);//false
        System.out.println(a<b||b<c);//true
        System.out.println(!(a>b));//true
        //&&遇false则false
        //||遇true则true
        //!做取反操作
        //注意：&&和||是短路的，即一旦能确定最终结果，后面的是不执行的
        int i = 5;
        System.out.println(i>6&&i++>3);//false
        System.out.println(i);//5

        short s = 5;
        //s = s+10;需要强转
        s+=10;//扩展运算符自带强转功能
        System.out.println(s);

        String name = "李明生";
        int age = 21;
        System.out.println("大家好，我叫"+name+",今年"+age+"岁了!");//此时的+是作为字符串连接符来使用的
        System.out.println(10+20+""+30);//3030
        System.out.println(""+10+20+30);//102030
        System.out.println(10+20+30+"");//60
         */
        int num = 5;
        int flag = num>4?1:-1;
        System.out.println(flag);//1

        int a = 8,b = 5;
        System.out.println(a>b?a:b);//8

        //顺序结构--从上往下逐行执行，每句必走
        //分支结构--根据条件选择性的执行语句
        //循环结构--根据条件重复性的执行语句
    }
}
