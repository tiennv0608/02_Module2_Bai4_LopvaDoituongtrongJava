import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public StopWatch() {
    }

    public StopWatch(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = LocalDateTime.now();
    }

    public void stop() {
        this.endTime = LocalDateTime.now();
    }

    public int getElapse() {
        int miliSecond = ((endTime.getHour()-startTime.getHour())*3600 + (endTime.getMinute()-startTime.getMinute())*60 + (endTime.getSecond()-startTime.getSecond())*1000);
        return miliSecond;

    }

}
