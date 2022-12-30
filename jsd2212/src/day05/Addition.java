package day05;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for(int i = 1;i<=10;i++){
            int num1 = (int)(Math.random()*100+1);
            int num2 = (int)(Math.random()*100+1);
            System.out.println("("+i+")"+num1+"+"+num2+"=?");
            System.out.println("算吧");
            int result = scanner.nextInt();
            if(result==-1){
                System.out.println("程序终止~");
                break;
            }else if(result==num1+num2){
                System.out.println("算对了");
                score+=10;
            }else{
                System.out.println("算错了");
            }
        }
        System.out.println("总分为:"+score);
    }
}
