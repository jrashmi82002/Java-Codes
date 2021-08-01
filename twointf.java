interface one {
    public void show();
}

interface two {
    public void showing();
}

public class twointf implements one, two {
    public static void main(String[] args) {
        twointf t = new twointf();
        t.show();
        t.showing();
    }

    @Override
    public void showing() {
        System.out.println("I am interface TWO");
    }

    @Override
    public void show() {
        System.out.println("I am interface ONE");

    }
}
