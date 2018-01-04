package q12;

import java.util.ArrayList;
import java.util.List;

class Patient {
    String name;
    public Patient(String name ) {
        this.name = name;
    }
}

public class Test {
    public static void main(String[] args) {
        List<Patient> ps = new ArrayList<>();
        Patient p2 = new Patient("Mike");

        ps.add(p2);


        int f = -1;
        f = ps.indexOf(p2);
        System.out.println(f);
        f = ps.indexOf(new Patient("Mike"));
        System.out.println(f);
        Patient p = new Patient("Mike");
        f = ps.indexOf(p);
        System.out.println(f);
    }
}
