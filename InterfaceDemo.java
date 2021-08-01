interface NewInterface {

    static void hello() {
        System.out.println("Hello inside Static Method");
    }

    void overrideMethod(String str);
}

public class InterfaceDemo implements NewInterface {

    public static void main(String[] args) {
        InterfaceDemo interfaceDemo = new InterfaceDemo();
        NewInterface.hello();
        interfaceDemo.overrideMethod("Hello inside Override");
    }

    @Override
    public void overrideMethod(String str) {
        System.out.println(str);
    }
}