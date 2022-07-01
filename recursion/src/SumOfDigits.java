public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1111));
    }

    static int sumOfDigits(int num){
        if(num == 0) return 0;
        if(num < 0) return -1;
        return sumOfDigits(num/10) + num%10;
    }
}
