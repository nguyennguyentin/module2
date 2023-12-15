package ss4_Class_and_Object_in_java;

import java.sql.Time;
import java.util.Date;

public class demoBT2 {
    private Time startTime , stopTime ;
    demoBT2 () {
        this.startTime = new Time(System.currentTimeMillis());
    }
    Time getStartTime () {
        return startTime;
    }
    Time getStopTime () {
        return stopTime;
    }
    void start () {
        startTime = new Time(System.currentTimeMillis());
        System.out.println("Time start is : " + getStartTime());
    }
    void stop () {
        stopTime = new Time(System.currentTimeMillis());
        System.out.println("Time stop is : " + getStopTime());
    }
    long getElapsedTime () {
        return getStopTime().getTime()-getStartTime().getTime();
    }
}
class TestStopWatch {
    public static void main(String[] args) {
        demoBT2 t = new demoBT2();
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Testing... ");
        t.stop();
        System.out.println("Elapsed time : " + t.getElapsedTime() + " milliseconds");
    }
}
