public class LogicBehindRecursion {

    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod(){
        secondMethod();
        System.out.println("I am the first method");
    }

    static void secondMethod(){
        thirdMethod();
        System.out.println("I am the second method");
    }

    static void thirdMethod(){
        fourthMethod();
        System.out.println("I am the third method");
    }

    static void fourthMethod(){
        System.out.println("I am the fourth method");
    }
}
