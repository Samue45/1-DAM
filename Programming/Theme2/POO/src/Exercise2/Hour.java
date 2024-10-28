package Exercise2;

import java.time.LocalTime;

public class Hour {

    //PROPERTIES
    private int hour, minutes, seconds;
    public static final int SYSTEM= 1, EVENING = 0;

    //CONSTRUCTOR
    public Hour(int hour, int minutes, int seconds){
        if (correctFormat(hour,minutes,seconds)){
            this.hour = hour;
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }

    public Hour(HourType type){
        if ( type == HourType.EVENING){
            this.hour = this.minutes = this.seconds = 0;
        } else if (type == HourType.SYSTEM) {
            LocalTime actualHour = LocalTime.now();
            this.hour = actualHour.getHour();
            this.minutes = actualHour.getMinute();
            this.seconds = actualHour.getSecond();
        }
    }

    public Hour(Hour hourCopy){
        this.hour = hourCopy.hour;
        this.minutes = hourCopy.minutes;
        this.seconds = hourCopy.seconds;
    }

    //GETTER and SETTER
    public int getHour(){
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    //ToString
    public String toString(){
        return setNormalFormat(hour) + ":" + setNormalFormat(minutes) + ":" + setNormalFormat(seconds);
    }

    //Set the common format
    public String setNormalFormat(int number){
        if (number < 10){
            return "0" + number;
        }
        return "" + number;
    }

    //Review format of the total hour
    public boolean correctFormat(int hour, int minutes, int seconds){
        return hour >=0 && hour <= 23 && minutes >=0 && minutes <= 59 && seconds >=0 && seconds <= 59;
    }
}
