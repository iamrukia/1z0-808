package pkgB;

import pkgA.*;
public class Baz extends Foo {
    public static void main(String[] args) {
        Foo f = new Foo();
        Baz m = new Baz();

        /**
         * both a and b of f can not be accessed
        System.out.println(f.a);
        System.out.println(f.b);
         */
        System.out.println(m.b);
        System.out.println(f.c);
    }
}
