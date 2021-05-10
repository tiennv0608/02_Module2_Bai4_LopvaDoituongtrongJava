public class Child extends Parents {

    public Child() {
        System.out.println("This is child");
    }

    public Child(String website) {
        super(website);
        System.out.println("This is child");
    }

    public static void main(String[] args) {
        Child child1 = new Child();
        System.out.println("---");
        Child child2 = new Child("gpcoder.com");
    }
}
