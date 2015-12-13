package chapter2;
public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long currentHourEastern = currentHour - 5;
        if (currentHourEastern <= 0) currentHourEastern = 12 + currentHourEastern;
        System.out.println("Current time is " + currentHourEastern + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
