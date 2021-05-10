public class ActiveFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fan.getFast());
        fan1.setRadius(10.0);
        fan1.setColor("Yellow");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.getMedium());
        System.out.println(fan2.toString());
    }
}
