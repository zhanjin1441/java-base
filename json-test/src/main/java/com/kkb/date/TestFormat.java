package com.kkb.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestFormat {

    public static void main(String[] args) {
        //获取当前时间日期
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //时间格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dtf.format(ldt);
        System.out.println(format);

        //创建一个指定时间
        LocalDateTime cdt = LocalDateTime.of(2020, 5, 10, 10, 40, 30);
        String format1 = dtf.format(cdt);
        System.out.println(format1);
        //计算日期时间差  第二个参数减去第一个参数
        Duration duration = Duration.between(ldt, cdt);
        System.out.println(duration.toDays());//相差的天数

    }
}
