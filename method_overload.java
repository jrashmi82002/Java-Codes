public class method_overload {

    public static void happy(String str) {
        System.out.println(str);
    }

    public static void happy(String str, int hp) {
        System.out.println(str + hp);
    }

    public static void main(String[] args) {
        happy("Stay happy!");
        happy("stay happy!", 2);
    }
}
