package com.hzy.improve.redis.redisLock;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.UUID;

/**
 * Created by eju on 2018/3/29.
 */
public class RedisLockTest {

    private static final int port = 6379;
    private static Jedis jedis= null;

    public static void main(String[] args) {

        JedisPool pool = null;
        JedisPoolConfig config = new JedisPoolConfig();
        pool = new JedisPool(config,"172.28.21.23",6379,10000);
        jedis = pool.getResource();
        RedisService redisService = new RedisService(jedis);
        for(int i=0;i<10;i++){
            RedisThread redisThread = new RedisThread(redisService, UUID.randomUUID().toString());
            Thread thread = new Thread(redisThread,("线程"+i));
            thread.start();
        }
    }
}
