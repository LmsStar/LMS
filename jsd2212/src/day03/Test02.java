package day03;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        /*
        int a = 15,b = 7;
        System.out.println(a>b?a:b);
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+"年是闰年");
        }else{
            System.out.println(year+"年是平年");
        }
    }
}
