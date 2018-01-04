package q39;

public class FieldInit {
    char c;
    boolean b;
    float f;

    void printAll(){
        System.out.println("C=" + c);
        System.out.println("C=" + b);
        System.out.println("C=" + f);
    }

    public static void main(String[] args) {
        FieldInit fieldInit = new FieldInit();
        fieldInit.printAll();

        int x = fieldInit.c;
        System.out.println(x);
    }
}
