abstract class abs { // abstract keyword is compulsory and one abstract method also
    public void func() {
        System.out.println("inside abs class non abstract method");
    }

    abstract public void func1();
}

public class abstracts extends abs {// only one class can be public and that containing main function
    @Override // compulsory to define abstract function in subclass
    public void func1() {
        System.out.println("in extended class abstract in abs");
        abstracts A = new abstracts();
        A.func();
    }

    public static void main(String[] args) {

        abstracts A = new abstracts();// object inside the main function
        // abs A = new abstracts(); // can do this way also making object by reference
        // abs A = new abs(); //not possible as abstract class can not have its object
        A.func1();
    }

}
