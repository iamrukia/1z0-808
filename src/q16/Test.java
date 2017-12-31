package q16;

public class Test {
    public static void main(String[] args) throws Exception {
        Candidate candidate = new Candidate("James", 20);
        Candidate candidate1 = new Candidate("Williams", 32);
        System.out.println(candidate);
        System.out.println(candidate1);
    }
}

class MissingInfoException extends Exception {}

class AgeOutofRangeException extends Exception {}

class Candidate {
    String name;
    int age;

    Candidate(String name, int age) throws Exception{
        if (name == null) {
            throw new MissingInfoException();
        } else if (age <= 10  || age >= 90) {
            throw new AgeOutofRangeException();
        } else {
            this.name = name;
            this.age = age;
        }
    }

    public String toString(){
        return name + " age: " + age;
    }
}
