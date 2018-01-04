package q23;

public class Test {
    public static void main(String[] args) {
        try{
            String[] arr = new String[4];

            arr[1] = "Unix";
            arr[2] = "Linux";
            arr[3] = "Solarios";

            int index = 6;


            int[] aaa = new int[5];
            System.out.println(aaa[0]);

            System.out.println("-----------");
            for (String var: arr) {
                System.out.print(var + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }

}
