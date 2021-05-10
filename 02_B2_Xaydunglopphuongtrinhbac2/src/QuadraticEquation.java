public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getCriminant() {
        return (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }

    public double getRoot1() {
        if (this.getCriminant() >= 0) {
            return (-this.b + Math.pow(this.getCriminant(), 0.5)) / (2 * this.a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (this.getCriminant() >= 0) {
            return (-this.b - Math.pow(this.getCriminant(), 0.5)) / (2 * this.a);
        } else {
            return 0;
        }
    }
}
