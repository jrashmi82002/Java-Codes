class superbase {
    superbase() {
        System.out.println("Super constructor");
    }

    public void baseshow() {
        System.out.println("Inside super base Class");
    }
}

class child extends superbase {
    child() {
        System.out.println("Child constructor");
    }

    public void childshow() {
        System.out.println("Inside Child of Super");
    }

    public static void main(String[] args) {
        // superbase s1 = new superbase();
    }
}

public class multilevel extends child {
    public static void main(String[] args) {
        multilevel ml = new multilevel();
        // child c = new child();
        ml.baseshow();
        ml.childshow();
    }
}
