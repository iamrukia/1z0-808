package q5;

public class Calc extends Mid{
    public static void main(String[] args) {
        int n1 = 22, n2 = 2;

        Calc c = new Calc();
        int n3 = c.findMid(n1, n2);

        Mid m1 = new Calc();
        int n4 = m1.findMid(n1, n2);

        System.out.print(n3);
        System.out.print(n4);
    }
}

class Mid {
    public int findMid(int n1, int n2) {
        return (n1 + n2) / 2;
    }
}
