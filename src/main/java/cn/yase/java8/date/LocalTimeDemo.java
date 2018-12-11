package cn.yase.java8.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yase
 * @create 2018-11-28
 */
public class LocalTimeDemo {

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_TIME_FORMAT_TWO = "yyyy/MM/dd HH:mm:ss";
    public static final String DATE_TIME_FORMAT_THREE = "yyyyMMddHHmmss";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_FORMAT0 = "yyyyMMdd";
    public static final String DATE_FORMAT_INTEGER_FULL = "yyyyMMddHHmmss";
    public static final String TIME_FORMAT = "HH:mm:ss";

    public static void main(String[] args) {
//        //获取前一小时的数据
//        Integer hour = LocalTime.now().minusHours(1).getHour();
//        System.out.println("hour = "+hour);
//
//        //获取当前时间 yyyyMMddHHmmss格式
//        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_TIME_FORMAT_THREE));
//        System.out.println("time = "+time);
//
//        //获取当天的零点
//        LocalDateTime todayStart = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
//        System.out.println("todayStart"+todayStart.format(DateTimeFormatter.ofPattern(DATE_TIME_FORMAT)));
//        //获取当天结束时间
//        LocalDateTime todayEnd = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
//        System.out.println("todayEnd"+todayEnd.format(DateTimeFormatter.ofPattern(DATE_TIME_FORMAT)));
//
//        //比较两个时间相差多少秒
//        long seconds = Duration.between(todayStart, todayEnd).getSeconds();
//        System.out.println("seconds = "+seconds);
//
//        Long timesDiffMinutes = getTimesDiffMinutes(LocalDateTime.parse("2018-01-01 11:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.now());
//        System.out.println("timesDiffMinutes = "+timesDiffMinutes);

//        Long timesDiffDays = getTimesDiffDays(LocalDateTime.parse("2018-01-01 18:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.now());
//        System.out.println("timesDiffDays = "+timesDiffDays);

        long until = until(LocalDate.parse("2018-12-10 18:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("until = "+until);

    }

    /**
     * 获取两个时间的差值（单位：分钟）
     * @param beforeTime
     * @param afterTime
     * @return
     */
    public static Long getTimesDiffMinutes(LocalDateTime beforeTime,LocalDateTime afterTime){


        Duration between = Duration.between(beforeTime, afterTime);

        return between.toMinutes();
    }

    public static Long getTimesDiffDays(LocalDateTime beforeTime,LocalDateTime afterTime){
        Duration between = Duration.between(beforeTime, afterTime);

        return between.toDays();
    }


    public static long until(LocalDate beforeTime){
        return beforeTime.until(LocalDate.now(), ChronoUnit.DAYS);
    }


}
