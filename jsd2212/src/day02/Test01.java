package day02;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要判断的整数:");
        int num = scanner.nextInt();
        boolean flag = true;
        if(num<2){
            System.out.println("不是质数");
        }else{
            for(int i = 2;i<num;i++){
                if(num%i==0){
                    flag =false;
                    System.out.println("不是质数");
                    break;
                }
            }
            if(flag){
                System.out.println("是质数");
            }
        }
    }
}
