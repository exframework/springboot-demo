package com.xxxx.demo.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class PropCollection {
	//@Value("#{'${lists}'.split(',')}")
	List<String> list = new ArrayList<String>();

	public List<String> getList() {
		return list;
	}

	Map<String, String> map = new HashMap<String, String>();

	public Map<String, String> getMap() {
		return map;
	}
}
