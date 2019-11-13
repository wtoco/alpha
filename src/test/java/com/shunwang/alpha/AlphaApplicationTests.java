package com.shunwang.alpha;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlphaApplicationTests {

	@Test
	public void contextLoads() {
		Jedis jedis = new Jedis("47.98.150.176",6379);
		jedis.auth("Chang3M3Now.");
		jedis.set("1","123");
		System.out.println(jedis.get("1"));
	}

}
