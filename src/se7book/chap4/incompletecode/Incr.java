package se7book.chap4.incompletecode;

class Incr {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;
        /**
         * x _ _ ;
         * _ _ _ ;
         * _ _ _ ;
         * _ _ _ ;
         */

        x *= x;
        y *= y;
        y *=y;
        x -= y;
        System.out.println(x);
    }
}
