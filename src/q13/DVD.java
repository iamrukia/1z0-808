package q13;

class CD {
    int r;
    CD (int r) {
        this.r = r;
    }
}
public class DVD extends CD{
    int c;
    DVD (int r, int c){
        super(r);
        super.r = r;
        this.c = c;
    }

    public static void main(String[] args) {

    }
}
