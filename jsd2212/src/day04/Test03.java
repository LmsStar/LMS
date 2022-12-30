package day04;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num==0){
            System.out.println("0");
        }else if(num>0){
            System.out.println("+");
        }else{
            System.out.println("-");
        }
    }
}
