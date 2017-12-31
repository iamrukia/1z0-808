package se7book.chap2;

class Alpha{
    static String s = " ";
    protected Alpha() {
        s += "alpha ";
    }
}

class SubAlpha extends Alpha {
    private SubAlpha(){
        s += "sub ";
    }
}
public class SubSubAlpha extends Alpha{
    private SubSubAlpha() {
        s += "subsub ";
    }

    public static void main(String[] args) {
        new SubSubAlpha();
        //new SubAlpha();
        System.out.println(s);
    }
}
