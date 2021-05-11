package Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    int speed = SLOW;
    boolean on = false;
    double radius = 5;
    private String color = "blue";

    public Fan() {
        this.on = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on = true;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn())
            return "Fan{" +
                    "is ON " +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        else
            return "Fan{" +
                    "is OFF " +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
    }

}

