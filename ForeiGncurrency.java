package com.example.word_pdf_payment.util;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForeiGncurrency {

    Jedis jedis = null;

    public ForeiGncurrency(){
        jedis = new RedisUtil().jedis;
    }

    public boolean init(){
        Map<String,String> map = new HashMap<>();
        map.put("Fname_1","RMB");
        map.put("Fname_2","USD");
        map.put("Fname_3","EUR");
        map.put("Fname_4","GBP");
        map.put("Fname_5","AUD");
        map.put("Fname_6","HKD");
        map.put("Fname_7","INR");
        map.put("Fname_8","CAD");
        map.put("Fname_9","MYR");
        map.put("Fname_10","JPY");
        //添加名称为hash（key）的hash元素
        jedis.hmset("hashFname",map);

        /*Map<String,String> map1 = new HashMap<>();
        map1.put("Bname_1","¥");
        map1.put("Bname_2","$");
        map1.put("Bname_3","€");
        map1.put("Bname_4","￡");
        map1.put("Bname_5","A$");
        map1.put("Bname_6","HK$");
        map1.put("Bname_7","INR");
        map1.put("Bname_8","CAD");
        map1.put("Bname_9","MYR");
        map1.put("Bname_10","J¥");
        //添加名称为hash（key）的hash元素
        jedis.hmset("hashBname",map1);*/

        return true;
    }
    /**
     * 转换货币名称
     * @return {@link String}
     */
    public String Fore_id_to_FName(String id){
        List<String> list1 = jedis.hmget("hashFname","Fname_"+id);
        return list1.get(0);
    }

    /**
     * 转换货币符号
     * @return {@link String}
     */
    public String Fore_id_to_BName(String id){
        List<String> list1 = jedis.hmget("hashBname","Bname_"+id);
        return list1.get(0);
    }


}
