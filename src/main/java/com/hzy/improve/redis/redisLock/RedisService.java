package com.hzy.improve.redis.redisLock;

import redis.clients.jedis.Jedis;

/**
 * Created by eju on 2018/3/29.
 */
public class RedisService {

    Jedis jedis = null;
    String lockKey = "testLock";

    public RedisService(Jedis jedis){
        this.jedis = jedis;
    }

    int n = 500;
    public void getNumber(String requestId,Integer expirTime){

        boolean flag = false;
        while (!flag) {
            flag = RedisTool.tryGetDistributedLock(jedis, lockKey, requestId, expirTime);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
        if (flag) {
            System.out.println(Thread.currentThread().getName() + "正在执行！");
            System.out.println(--n);
            RedisTool.releaseDistributedLock(jedis, lockKey, requestId);
        }
    }
}
