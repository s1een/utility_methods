package org.example.utility;

public final class utilityMethods {
    private utilityMethods(){
        throw new AssertionError();
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static boolean isEven(int a){
        return a % 2 == 0;
    }
}
