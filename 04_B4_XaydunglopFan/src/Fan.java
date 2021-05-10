public class Fan {
    private static final int slow = 1;
    private static final int medium = 2;
    private static final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {

    }

    public static int getSlow() {
        return slow;
    }

    public static int getMedium() {
        return medium;
    }

    public static int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        if (this.isOn()) {
            return "Fan is on (Speed: " + this.speed + " ,radius: " + this.radius + " ,color: " + this.color + ")";
        } else {
            return "Fan is off (Radius: " + this.radius + " ,color: " + this.color + ")";
        }
    }
}
