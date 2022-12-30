package day04;

import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        arr1 = Arrays.copyOf(arr1,arr1.length+1);
        arr1[3] = 4;
        System.out.println(Arrays.toString(arr1));
    }
}