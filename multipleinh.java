interface inter {
    public void show();
}

class multi {
    public void showing() {
        System.out.println("\nsInside multi class extended in multipleinh.");
    }
}

public class multipleinh extends multi implements inter {
    public static void main(String[] args) {
        multipleinh m = new multipleinh();
        m.show();
        m.showing();
    }

    @Override
    public void show() {
        System.out.println("\nInside inter interface implemented in multipleinh.");
    }
}
