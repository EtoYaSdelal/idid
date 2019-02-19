package algorithms.util;

import java.time.Duration;
import java.time.Instant;

public class Timer {
    private Instant start;
    private Instant end;

    public void setStart(Instant start) {
        this.start = start;
    }

    public void setEnd(Instant end) {
        this.end = end;
    }

    public double getTime(){
        return Duration.between(start,end).toMillis()/1000.0;
    }
}
