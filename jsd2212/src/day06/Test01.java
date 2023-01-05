package day06;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入想要生成的行数:");
        int line = scanner.nextInt();
        createStar(line);
    }
    public static void createStar(int line){
        for(int i = 1;i<=line;i++){
            for(int j = 0;j<line-i;j++){
                System.out.print(" ");
            }
            for (int k = 0;k<i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
