package com.kkb.date;

import java.util.Date;

public class TestDate {

    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);
        System.out.println(date.getTime());//获取时间戳
    }
}
