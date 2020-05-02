package com.kkb.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonTest {

    public static void main(String[] args) {

        /**
         * 将json字符串转换成bean对象
         */
        String jsonString="{name:'chris',age:25,sex:'male',birthday:'20050609'}";
        UserInfo userInfo = JSON.parseObject(jsonString, UserInfo.class);
        System.out.println(userInfo);

        /**
         * 将bean对象转换成json字符串
         */
        UserInfo u1 = new UserInfo();
        u1.setName("chris");
        u1.setAge(25);
        u1.setSex("male");
        u1.setBirthday("0609");
      /*  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String str = sdf.format(date);*/


        String s = JSON.toJSONString(u1);
        System.out.println(s);


        /**
         * 如果调用第三方接口那么通常会返回json字符串
         * 把json字符串转为json对象
         */
        JSONObject jsonObject = (JSONObject)JSON.parse(jsonString);
        System.out.println(jsonObject.get("name").toString());

        /**
         * 将bean对象转换成json对象
         */
        UserInfo u2 = new UserInfo();
        u1.setName("chris");
        u1.setAge(25);
        u1.setSex("male");
        u1.setBirthday("0609");
        Object o = JSON.toJSON(u2);
    }
}
