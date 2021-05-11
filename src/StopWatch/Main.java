package StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch st1 = new StopWatch();
        long timeMilli1 = st1.getStartTime();
        System.out.println(timeMilli1);
        long timeMilli2 = st1.getEndTime();
        System.out.println(timeMilli2);

    }
}
