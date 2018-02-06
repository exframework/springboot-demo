package com.xxxx.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxxx.demo.config.DbConfig;
import com.xxxx.demo.config.PropCollection;
import com.xxxx.demo.config.PropSimple;

@RestController
public class DemoController {
	@Autowired
	private PropSimple propConfig;
	@Autowired
	private PropCollection propList;
	@Autowired
	private DbConfig dbConfig;

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}

	@RequestMapping("/str")
	public String getStr() {
		return propConfig.getStrValue();
	}

	@RequestMapping("/int")
	public String getInt() {
		return String.valueOf(propConfig.getIntValue());
	}

	@RequestMapping("/list")
	public List<String> getList() {
		return propList.getList();
	}

	@RequestMapping("/map")
	public Map<String, String> getMap() {
		return propList.getMap();
	}

	@RequestMapping("/dbconfig")
	public String getDb() {
		return dbConfig.toString();
	}
}
