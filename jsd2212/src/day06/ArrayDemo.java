package day06;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100+1);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("[  ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+"  ");
        }
        System.out.print("]");
        /*
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[6];
        System.arraycopy(arr1,0,arr2,0,5);
        arr2 = Arrays.copyOf(arr1,arr1.length+1);
        System.out.println(Arrays.toString(arr2));
         */
    }
}
