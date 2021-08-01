public class coverload {
    coverload(String str) {
        System.out.println(str);
    }

    coverload(int a, int b) {
        System.out.println(a + " " + b);
    }

    coverload() {
        System.out.println("I am default. i dont have arguments");
    }

    public static void main(String[] args) {
        // coverload c = new coverload("hi");
        // coverload c1 = new coverload(10, 9);
        // coverload c2 = new coverload();
    }
}
