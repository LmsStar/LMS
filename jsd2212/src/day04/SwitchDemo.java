package day04;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("111");
                break;//不加break会产生case穿透现象
            case 2:
                System.out.println("222");
                break;
            case 3:
                System.out.println("333");
                break;
            default:
                System.out.println("999");
        }
        System.out.println("匹配完成!");
    }
}
