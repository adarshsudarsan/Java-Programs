package javapackage;

public class practice {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int c = 0;
        
        c = b;
        b = a;
        a = c;

        System.out.println("a after swap = " + a);
        System.out.println("b after swap = " + b);
    }
}