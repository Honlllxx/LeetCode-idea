package com.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        //日期时间差
        Calendar cal=Calendar.getInstance();
        Date time = cal.getTime();
        System.out.println(time);

        LocalDateTime l1= LocalDateTime.now();
        LocalDateTime l2=LocalDateTime.now();
        Date date=new Date(0L);
        Duration duration=Duration.between(l1,l2);
        System.out.println(duration.toDays());

        LocalDateTime star= LocalDateTime.of(2023, 6, 1, 0, 0) ;
        LocalDateTime star2= LocalDateTime.of(2023, 6, 3, 0, 0) ;
        LocalDateTime star3= LocalDateTime.of(2025, 6, 1, 0, 0) ;
        Duration d1=	Duration.between(star, star3);
        System.out.println(d1.toDays());


    }
}
