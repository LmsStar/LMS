package day06;

import java.util.Arrays;

public class MethodTest {
    public static void main(String[] args) {
        say();
        sayHi("李明生");
        sayHello("李明生",22);
        System.out.println(getNum());
        System.out.println(plus(2,3));
        System.out.println(Arrays.toString(testArray(5,100)));
        System.out.println("继续执行....");
    }
    public static void say(){
        System.out.println("大家好");
    }
    public static void sayHi(String name){
        System.out.println("大家好，我叫"+name);
    }
    public static void sayHello(String name,int age){
        System.out.println("大家好，我叫"+name+",今年"+age+"岁了");
    }
    public static double getNum(){
        return Math.random()*100;
    }
    public static int plus(int num1,int num2){
        return num1+num2;
    }
    public static int[] testArray(int len,int max){
        int[] arr = new int[len];
        for(int i = 0;i< arr.length;i++){
            arr[i] = (int)(Math.random()*max+1);
        }
        return arr;
    }
}
