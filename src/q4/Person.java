package q4;

public class Person {
    String name;
    int age = 25;

    public Person(){

    }

    public Person(String name) {
        this();              //line n1
        setName(name);
    }

    public Person(String name, int age){
        new Person(name);        //line n2
        setAge(age);
    }

    // setter and getter methods go here
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}
