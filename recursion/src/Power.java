public class Power {

    public static void main(String[] args) {
        System.out.println(recursivePower(2, 3));
    }

    static int recursivePower(int base, int exponent){
        if(exponent == 0) return 1;
        if(exponent < 0) return -1; // only calculating positive exponentials
        return recursivePower(base, --exponent) * base;
    }
}
