import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double discriminant = quadraticEquation.getCriminant();
        if (discriminant >0) {
            System.out.println("The equation has two roots: " + quadraticEquation.getRoot1()+" and "+quadraticEquation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has one root: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no real roots!");
        }
    }
}
