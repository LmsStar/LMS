package day04;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = {12,23,11,24,43,65,46,17,68,20};
        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));
        for(int i = 0;i< arr.length-1;i++){
            for(int j = 0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }
}
