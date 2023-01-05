package day06;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generate(10,100)));
    }
    public static int[] generate(int len,int max){
        int[] arr = new int[len];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*(max+1));
        }
        return arr;
    }
}