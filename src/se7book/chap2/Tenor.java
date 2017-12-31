package se7book.chap2;

public class Tenor extends Singer{
    public static String sing(){
        return "fa";
    }
    public String dance(){
        return "tenor";
    }

    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();

        System.out.println(t.sing() + "   " + s.sing());
        System.out.println(t.dance() + "    " + s.dance());
    }
}
class Singer {
    public static String sing(){
        return "la";
    }
    public String dance(){
        return "singer";
    }
}
