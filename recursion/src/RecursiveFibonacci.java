public class RecursiveFibonacci {

    public static void main(String[] args) {
        //recursiveFibonacci(0, 1, 10);
        System.out.println(recursiveFibonacciInstructor(4));
    }

    static int recursiveFibonacci(int num1, int num2, int count){
        int sum = num1 + num2;
        if(count == 0){
            System.out.println(num2);
            return num2;
        }
        System.out.println(num2);
        //count--;
        return recursiveFibonacci(num2, sum, --count);
    }

    static int recursiveFibonacciInstructor(int n){
        if(n == 0 || n == 1)return n;
        if(n < 0) return -1;
        return recursiveFibonacciInstructor(n-1) + recursiveFibonacciInstructor(n-2);
    }
}
