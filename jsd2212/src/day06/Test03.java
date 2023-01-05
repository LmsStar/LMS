package day06;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0;i< arr.length;i++){
            arr[i] = (int)(Math.random()*100+1);
        }
        int max = arr[0];
        for(int i = 1;i< arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        arr = Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1] = max;
        System.out.println(Arrays.toString(arr));
    }
}
