package se7book.chap4.variablestate;

public class Spock {
    public static void main(String[] args) {
        int mask = 0;
        int count =0;

        if( ((5<7) || (++count < 10)) | mask++ < 10) mask = mask + 1; //count = 0, mask = 2

        if( (6 > 8) ^ false)                        mask = mask + 10; // nothing changed
        if( !(mask >1) && ++count > 1)              mask = mask + 100; // nothing changed

        System.out.println(mask + " " + count);      //2 0

        int a = 1;
        int b = 1;
        System.out.println(++a);
        System.out.println(b++);
    }
}
