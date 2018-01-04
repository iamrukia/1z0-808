package q15;

import java.io.IOException;

public class Demo {
    int i;

    private Demo(){}

    private Demo(int i){
        this.i = i;
    }

    public Demo(int i, int j) {
        this.i = i + j;
    }

    void doStuff() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) throws IOException {
        String a = "pen";
        String b = "pen";

        boolean ans1 = a.equals(b);

        System.out.println(ans1);

        Demo demo = new Demo();
        demo.doStuff();
    }


}
