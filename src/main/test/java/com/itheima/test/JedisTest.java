package com.itheima.test;


import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisTest {
    @Test
public void testJedis() {
        Jedis jedis = new Jedis("localhost", 6379);

        jedis.set("username", "xiaoming");
        String username = jedis.get("username");
        System.out.println(username);

        jedis.del("username");


        jedis.hset("myhash","address","beijing");
        String hValue = jedis.hget("myhash", "address");
        System.out.println(hValue);

        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }


        jedis.close();
    }
}
