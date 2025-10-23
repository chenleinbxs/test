package com.example.word_pdf_payment.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import redis.clients.jedis.Jedis;
public class RedisUtil {

    private static final Log log = LogFactory.getLog(RedisUtil.class);
    public Jedis jedis;
    public RedisUtil(){
        jedis= new Jedis("localhost");
        if(jedis.ping().equals("PONG")) {
            if (jedis != null) {
                log.info("redis(" + jedis + ")连接成功...");
            }
        }else{
            log.info("redis连接失败,请检测redis服务器是否启动!");
        }
    }
}
