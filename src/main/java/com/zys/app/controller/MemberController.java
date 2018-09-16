package com.zys.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 会员服务接口
 * @author ASUS
 *
 */
@RestController
public class MemberController {
	
	//:从配置文件中读取端口号的值
	@Value("${server.port}")
	private String serverPort;
	
	@RequestMapping("/getUserList")
	public List<String> getUserList() {
		//：测试服务超时的时候，进行服务降级
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		List<String> listUser = new ArrayList<String>();
		listUser.add("zhangsan");
		listUser.add("lisi");
		listUser.add("yushengjun");
		listUser.add("端口号："+serverPort);
		
		return listUser;
	}
	
	@RequestMapping("/getTestZuulMember")
	public  String testZuul(){
		return "this is 会员服务";
		
	}

}
