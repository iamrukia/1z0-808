package se7book.chap4.trueorfalse;

public class SpecialOps {
    public static void main(String[] args) {
        String s = "";
        boolean b1 = true;
        boolean b2 = false;

        int i = 10;
        if((b2 = false) | (21%5) > 2)  s += "x";
        if (b1 || (b2 == true)) s += "y";
        if (b2 == true) s += "z";

        System.out.println(s);

        System.out.println(i=10);

    }
}
