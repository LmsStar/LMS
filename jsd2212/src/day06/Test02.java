package day06;

public class Test02 {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    public static int sum(int num){
        if(num==1){
            return 1;
        }
        return num+sum(num-1);
    }
}
