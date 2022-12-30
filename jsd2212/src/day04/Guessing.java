package day04;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~~欢迎来到猜数字小游戏~~~~(数字范围1-100)");
        System.out.println("温馨提示: 输入0可提前终止游戏");
        int result = (int)(Math.random()*100+1);
        int count = 0;
        System.out.println("游戏开始,请猜吧~");
        while(true){
            int num = scanner.nextInt();
            count++;
            if(num==0){
                System.out.println("游戏终止，感谢体验");
                break;
            }
            if(num==result){
                System.out.println("恭喜您，猜对啦！！您一共猜了"+count+"次");
                break;
            }else{
                if(num>result){
                    System.out.println("猜大了");
                }else{
                    System.out.println("猜小了");
                }
                System.out.println("请继续猜吧~");
            }
        }
    }
}
