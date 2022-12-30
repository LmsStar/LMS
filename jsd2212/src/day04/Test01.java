package day04;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {12,21,3,14,25,64};
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("最大值为:"+max);
    }
}