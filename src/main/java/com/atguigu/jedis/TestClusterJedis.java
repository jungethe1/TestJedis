package com.atguigu.jedis;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

public class TestClusterJedis {

	public static void main(String[] args) {
		
		Set<HostAndPort> nodeSet = new HashSet<HostAndPort>();
		nodeSet.add(new HostAndPort("192.168.80.10", 6389));
//		nodeSet.add(new HostAndPort("192.16.80.10", 6380));
//		nodeSet.add(new HostAndPort("192.16.80.10", 6381));
//		nodeSet.add(new HostAndPort("192.16.80.10", 6389));
//		nodeSet.add(new HostAndPort("192.16.80.10", 6390));
//		nodeSet.add(new HostAndPort("192.16.80.10", 6391));
		
		JedisCluster jedisCluster = new JedisCluster(nodeSet);
		
		jedisCluster.set("k5", "v5");
		System.out.println(jedisCluster.get("k1"));
		
		//Map<String, JedisPool> clusterNodes = jedisCluster.getClusterNodes();
		//System.out.println(jedisCluster.ping());
		//System.out.println(clusterNodes);
		
	}
	
}
