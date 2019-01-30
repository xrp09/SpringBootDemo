package com.xrp09.demo.controller;

import com.xrp09.demo.pojo.JSONResult;
import com.xrp09.demo.pojo.User;
import com.xrp09.demo.utils.JsonUtils;
import com.xrp09.demo.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("redis")
public class RedisController {

    //这种比较底层的操作，需要封装到工具类
	@Autowired
	private StringRedisTemplate strRedis;

	//这种封装直接使用
	@Autowired
	private RedisOperator redis;
	
	@RequestMapping("/test")
	public JSONResult test() {
		
		strRedis.opsForValue().set("imooc-cache", "hello ~~~~~~");
		
		User u  =  new User();
		u.setName("xxx");
		u.setAge(1);
		u.setLove(new Date().toString());
		u.setDesc(null);
		u.setTest(new Date());
		strRedis.opsForValue().set("json:user", JsonUtils.objectToJson(u));
		User jsonUser = JsonUtils.jsonToPojo(strRedis.opsForValue().get("json:user"), User.class);
		return JSONResult.ok(jsonUser);
	}
	
	@RequestMapping("/getJsonList")
	public JSONResult getJsonList() {

		User u  =  new User();
		u.setName("xxx");
		u.setAge(1);
		u.setLove(new Date().toString());
		u.setDesc(null);
		u.setTest(new Date());

		User u1  =  new User();
		u1.setName("xxx");
		u1.setAge(2);
		u1.setLove(new Date().toString());
		u1.setDesc(null);
		u1.setTest(new Date());

		User u2  =  new User();
		u2.setName("xxx");
		u2.setAge(3);
		u2.setLove(new Date().toString());
		u2.setDesc(null);
		u2.setTest(new Date());

		List<User> userList = new ArrayList<>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u);

		redis.set("json:info:userlist", JsonUtils.objectToJson(userList), 2000);

		String userListJson = redis.get("json:info:userlist");
		List<User> userListBorn = JsonUtils.jsonToList(userListJson, User.class);

		return JSONResult.ok(userListBorn);
	}
}