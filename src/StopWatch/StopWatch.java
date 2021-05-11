package StopWatch;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        Date date = new Date();
        return date.getTime();
    }

    public long getEndTime() {
        Calendar calendar = new GregorianCalendar();
        return calendar.getTimeInMillis();
    }

}