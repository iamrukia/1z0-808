package q20;

public class TestApp {
    public void doList() throws Exception {
        throw new Error("Error");
    }
    public void doPrint() throws Exception {
        throw new RuntimeException("Exception");
    }

    public static void main(String[] args) {
        TestApp testApp = new TestApp();
        int x = 10;
        System.out.println(x>10?">":x<10?"<":"=");

        try {
            testApp.doPrint();
            testApp.doList();
        }
        catch (Exception e2) {
            System.out.println("Caught: " + e2 );
        }
    }
}
