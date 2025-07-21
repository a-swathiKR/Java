import java.util.Scanner;

public class HourAngleAndMinuteAngle {

    public static void calculateAngle(int hour,int minute){
        if(hour > 12){
            hour -= 12;
        }

        int hourAngle = (int)((hour * 30) + (minute * 0.5));
        int minuteAngle = (int)((minute * 6));

        int angle;
        if(hourAngle > minuteAngle){
             angle = hourAngle - minuteAngle;
        }else{
             angle = minuteAngle - hourAngle;
        }

        System.out.println(Math.min(angle,360-angle));
    }
    public static void main(String[] args) {

        int hour = 13;
        int minute = 15;

        calculateAngle(hour, minute);
    }
}
