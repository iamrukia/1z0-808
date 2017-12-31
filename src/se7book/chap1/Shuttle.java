package se7book.chap1;

class Rocket {
    private void blastOff() { System.out.print("Bang");}
}
public class Shuttle extends Rocket{
    public static void main(String[] args) {
        new Shuttle().go();
    }

    void go() {
        blastOff();
    }

    private void blastOff() {System.out.print("sh-bang ");}
}
