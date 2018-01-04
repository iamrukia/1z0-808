package q40;

public class Demo {
    public static void main(String[] args) {

        String[] shirts[] = new String[2][2];
        shirts[0][0] = "a";
        shirts[0][1] = "b";
        shirts[1][0] = "c";
        shirts[1][1] = "d";

        for (String[] color : shirts) {
            for (String size : color){
                System.out.println(size);
            }
        }

        String xxx = "Java";
        System.out.println(xxx.substring(2));
    }
}
