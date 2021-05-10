public class Parents {

    private String website;

    public Parents() {
        System.out.println("This is parent");
        print();
    }

    public Parents(String website) {
        this.website = website;
        System.out.println("This is parent");
        print();
    }

    public void print() {
        System.out.println("Website = " + website);
    }
}
