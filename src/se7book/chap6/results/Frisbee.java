package se7book.chap6.results;

import java.io.IOException;

public class Frisbee {
    public static void main(String[] args) throws RuntimeException {
        int x = 0;
        try {
            System.out.println(7 / x);
        } catch (Exception e) {
            ;
        }
    }
}
