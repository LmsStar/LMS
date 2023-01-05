package day06;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100+1);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
