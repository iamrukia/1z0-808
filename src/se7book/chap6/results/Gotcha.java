package se7book.chap6.results;

public class Gotcha {
    public static void main(String[] args) {
        //new Gotcha().go();
        try { new Gotcha().go();}
        catch (Error e) {
            System.out.println("ouch");
        }
    }
    void go() {
        go();
    }
}
