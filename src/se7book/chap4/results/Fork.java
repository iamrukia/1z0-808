package se7book.chap4.results;


public class Fork {
    public static void main(String[] args) {
        System.out.println(args.length);
        /*
        the | will still evaluate both side operands results...
         */
        if(args.length == 1 | args[1].equals("test")) {
            System.out.println("test case");
        } else {
            System.out.println("production " + args[0]);
        }
    }
}

/**
 * Run the application with
 * java Fork live2
 */
