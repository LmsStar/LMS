package day03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----欢迎来到猜数字小游戏（数字范围1-100）----");
        int result = (int)(Math.random()*100+1);
        int count=0;
        System.out.println("请猜吧~");
        while(true){
            int num = scanner.nextInt();
            if(num==0){
                System.out.println("游戏中断，欢迎下次体验！");
                break;
            }
            count++;
            if(num==result){
                System.out.println("恭喜你！猜对啦！！！");
                System.out.println("你一共猜了"+count+"次");
                break;
            }else{
                if(num>result){
                    System.out.println("猜大了!");
                }else{
                    System.out.println("猜小了!");
                }
                System.out.println("请继续猜吧~");
            }
        }
    }
}
