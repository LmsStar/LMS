package day02;

public class Test02 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        int[] arr2 = new int[]{1,2,3};
        int[] arr3 = {1,2,3};
        for(int i:arr3){
            System.out.println(i);
        }
    }
}