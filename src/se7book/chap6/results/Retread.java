package se7book.chap6.results;

import se7book.chap2.Redwood;

class MyException extends Exception {}

class Tire {
    void doStuff() {}
}
public class Retread extends Tire{
    public static void main(String[] args) {
        new Retread().doStuff();
    }

    @Override
    void doStuff() throws ArithmeticException{
        System.out.println(7/0);
    }
}
