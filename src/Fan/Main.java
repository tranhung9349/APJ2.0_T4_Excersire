package Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setRadius(10);
        fan1.setSpeed(3);
        fan1.setColor("Yellow");
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        System.out.println(fan2.toString());
    }
}
