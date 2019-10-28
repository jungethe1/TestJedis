package com.atguigu.jedis;

import redis.clients.jedis.Jedis;

public class TestJedis {

	public static void main(String[] args) {

		Jedis jedis = new Jedis("192.168.80.10", 6379);
		
		String ping = jedis.ping();
		System.out.println(ping);
		
		jedis.close();
		
		String ping2 = jedis.ping();
		System.out.println(ping2);
		
	}

}
