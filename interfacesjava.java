interface solve {
    void add(int a, int b);

    void mul(int a, int b);
}

interface solve1 {// all functions in it are abstract
    abstract void sub(int a, int b);// we can use or not abstract keyword

    void div(int a, int b);
    // void div(int a, int b)// can not define a function inside interface
    // {
    // System.out.println("in interface!");
    // }
}

public class interfacesjava implements solve, solve1 {// implement keyword for interface including
    public static void main(String[] args) {

        interfacesjava ij = new interfacesjava();
        ij.add(9, 10);
        ij.mul(7, 8);
        ij.sub(24, 11);
        ij.div(15, 3);
    }

    @Override // necesarry to define all functions of an interface
    public void add(int a, int b) {// public keyword is compulsory here
        System.out.println(a + b);
    }

    @Override
    public void mul(int a, int b) {
        System.out.println(a * b);
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    @Override
    public void div(int a, int b) {
        System.out.println(a / b);
    }

}
