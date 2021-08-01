class base {
    int a1, b1;

    public base(int a1, int b1) {
        this.a1 = a1;
        this.b1 = b1;
        System.out.println("Base parameterized constructor");
        System.out.println(a1 + " " + b1);
    }

    public base() {
        System.out.println("In Base default constructor");
    }
}

public class ctor extends base {
    int a, b;

    public ctor() {
        super();// incase of holding base class arguments here default constrcvtor
        System.out.println("Inside default constructor");
    }

    public ctor(int x, int y, int x1, int y1) {// with class name and public access and no datatype
        super(x1, y1);// carry parameters of base constructor
        a = x;
        b = y;
        System.out.println("Parameterized constructor");
    }

    void fun() {
        System.out.println("Keep learning! bye!");
    }

    public static void main(String[] args) {
        ctor c = new ctor();// default
        ctor c1 = new ctor(10, 9, 4, 5);// parameterised constructor
        System.out.println(c1.a + " " + c1.b);
        c.fun();
    }
}
