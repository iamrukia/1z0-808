package se7book.chap1;


public class Electronics implements Device{
    public void doIt() {}
}

abstract class Phone1 extends Electronics {}

abstract class Phone2 extends Electronics {
    public void doIt(int x) {}
}
class Phone3 extends Electronics implements Device {
    public void doStuff() {}
}

interface Device {public void doIt();}

