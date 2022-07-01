public class Power {

    public static void main(String[] args) {
        System.out.println(recursivePower(-2, 3));
    }

    static int recursivePower(int num, int power){
        if(power == 0) return 0;
        if(power == 1) return num;
        return recursivePower(num, --power) * num;
    }
}
