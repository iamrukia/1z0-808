package se7book.chap5.results;

public class Actors {
    public static void main(String[] args) {
        char[] ca = { 0x4e, '\u004e', 78}; // needs to be in single quote when doing \\u style
        System.out.println((ca[0]==ca[1])+ " " + (ca[0]==ca[2]));
    }
}
