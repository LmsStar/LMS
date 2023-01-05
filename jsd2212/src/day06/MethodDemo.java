package day06;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {
        say("李明生",22.0);//实参
        System.out.println(getNum());//调用方法的同时输出方法返回值
        System.out.println(plus(1,2));
        System.out.println(Arrays.toString(testArray(10,100)));
        System.out.println("继续执行...");
    }
    //方法的重载(根据参数列表进行匹配)
    public static void say(String name,int age){//形参
        System.out.println("大家好，我叫"+name+",今年"+age+"岁了");
        System.out.println("我是第一个say方法");
    }
    public static void say(String name,double age){
        System.out.println("大家好，我叫"+name+",今年"+age+"岁了");
        System.out.println("我是第二个say方法");
    }
    public static double getNum(){
        return Math.random()*100;
    }
    public static int plus(int num1,int num2){
        return num1+num2;
    }
    public static int[] testArray(int len,int max){//自定义长度与随机数范围
        int[] arr = new int[len];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*max+1);
        }
        return arr;
    }
}
