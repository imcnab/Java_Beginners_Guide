package Chapter01;
/*
    This demonstrates a variable.

    Call this file Chapter01.Example2.java
 */

public class Example2 {
    public static void main(String[] args) {
        int var1;   // this declares a variable
        int var2;   // this declares another variable

        var1 = 1024;    // this assigns 1024 to var1

        System.out.println("var1 contains " + var1);

        var2 = var1 / 2;

        System.out.print("var2 contains var1 / 2 : ");
        System.out.println(var2);
    }

}
