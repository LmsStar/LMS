package day05;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            //System.out.print(arr[i]+"  ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
