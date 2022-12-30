package day03;

public class IfDemo {
    public static void main(String[] args) {
        int num = 6;
        if(num%2==0){
            System.out.println(num+",是偶数");
        }else{
            System.out.println(num+",不是偶数");
        }
        double price = 600;
        if(price>=500){
            price*=0.8;
        }
        System.out.println("优惠之后的价格为:"+price+"元");

        double score = 95.5;
        if(score>=0&&score<=100){
            System.out.println("您的成绩:"+score+" 是合法的");
        }else{
            System.out.println("成绩不合法");
        }
    }
}
