package se7book.chap1;

enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
    Animals(String s) {sound = s;}

}
public class TestEnum {
    static Animals a;

    public static void main(String[] args) {
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
        System.out.println(Animals.DOG.sound + " " + Animals.FISH.sound);
    }
}
