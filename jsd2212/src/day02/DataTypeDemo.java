package day02;

public class DataTypeDemo {
    public static void main(String[] args) {
        int i = 2147483647;//int类型的最大值
        System.out.println(i+1);//最大值+1之后溢出变为最小值
        System.out.println(5/2);//int类型默认无条件舍弃小数部分
        //整数直接量默认是int类型

        long l = 10000000000L;//长整型直接量后面要加L或者l
        System.out.println(l);
        long e = 10000000000L*2;//运算时为了避免溢出，直接在第一个数后面加L
        System.out.println(e);
        long f = 1000000000*3*10L;//10L前的数已经发生溢出了
        System.out.println(f);

        double d = 2;//哪怕没有小数点，double也会默认加上小数点
        System.out.println(d);//2.0
        //小数直接量默认是double类型
        float fl = 3.14F;//小数直接量后面加上F表示float类型
        double d1=3,d2=2.9;
        System.out.println(d1-d2);//结果是有微小误差的

        boolean bo1 = true;//真
        boolean bo2 = false;//假

        char c1 = '男';//字符型直接量，要用单引号括起来
        char c2 = 97;//可以直接赋值整数直接量，但是其表现形式还是一个字符，即输出时结果为数字97所对应的字符a
        System.out.println(c1);
        System.out.println(c2);

        //类型转换: 1.自动类型转换  2.强制类型转换
        int i1 = 10;
        long l1 = i1;//自动类型转换
        long l2 = 100000000L;
        int i2 = (int)l2;//强制类型转换
        //注意：强制类型转换可能会造成数据溢出或者丢失精度
        byte b1 = 1;
        byte b2 = 2;
        byte b3 = (byte)(b1+b2);//b1+b2的结果为int类型，所以需要转换成byte类型
    }
}
