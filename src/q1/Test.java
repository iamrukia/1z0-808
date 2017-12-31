package q1;

public class Test {
    static  int count = 0;
    int i = 0;

    public void changeCount() {
        while (i < 5) {
            i++;
            count++;
        }
    }
    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();
        test1.changeCount();
        test2.changeCount();

        System.out.print(test1.count + " : " + test2.count);
    }
}
