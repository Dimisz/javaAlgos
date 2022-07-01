public class BasicRecursiveMethod {
    public static void main(String[] args) {
//        recursiveMethod(4);
        System.out.println(recursiveFactorial(4));
    }

    static void recursiveMethod(int n){
        if(n < 1){
            System.out.println("n is less than 1");
        }
        else{
            recursiveMethod(n - 1);
            System.out.println(n);
        }
    }

    static int recursiveFactorial(int num){
        if(num < 0){
            return -1;
        }
        if(num == 1 || num == 0){
            return num;
        }
        else{
            return num * recursiveFactorial(num - 1);
        }
    }

}
