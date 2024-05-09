import java.time.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String[] split1 = s1.split(":");
        String[] split2 = s2.split(":");

        int current = Integer.parseInt(split1[0]) * 60 * 60 + Integer.parseInt(split1[1]) * 60 + Integer.parseInt(split1[2]);
        int start = Integer.parseInt(split2[0]) * 60 * 60 + Integer.parseInt(split2[1]) * 60 + Integer.parseInt(split2[2]);
        int between = start - current;
        if (between < 0) between += 60 * 60 * 24;
        LocalTime time = LocalTime.ofSecondOfDay(between);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        System.out.printf("%02d:%02d:%02d",hour,minute,second);
    }
}