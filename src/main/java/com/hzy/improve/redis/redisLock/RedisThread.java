package com.hzy.improve.redis.redisLock;

/**
 * Created by eju on 2018/3/29.
 */
public class RedisThread implements Runnable {

    RedisService redisService = null;
    String requestId = null;
    Integer expirTime = 10;

    public RedisThread(RedisService redisService,String requestId){
        this.requestId = requestId;
        this.redisService = redisService;
    }

    public void run() {
        redisService.getNumber(requestId,expirTime);
    }
}
