package com.kkb.date;

import java.time.LocalDate;

public class TestLocalDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("今天的日期是"+today);
        System.out.println("现在是哪年"+today.getYear());
        System.out.println("现在是哪月"+today.getMonth());
        System.out.println("现在是哪月(数字)"+today.getMonthValue());
        System.out.println("现在是周几"+today.getDayOfWeek());
    }
}
