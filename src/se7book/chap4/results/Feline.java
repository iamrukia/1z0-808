package se7book.chap4.results;

public class Feline {
    public static void main(String[] args) {

        long x = 42L;
        long y = 44L;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(foo() + x + 5 + " ");
        System.out.println(x + y + foo());

        System.out.println(7 + 2 + " x");
        System.out.println("x" + 7 + 2);
    }

    static String foo() {return "foo";}
}
