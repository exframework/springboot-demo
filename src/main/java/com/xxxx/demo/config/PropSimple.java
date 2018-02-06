package com.xxxx.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 要注入属性值的类必须由spring管理
 */
@Configuration
public class PropSimple {
	@Value("${str-value}")
	private String strValue;
	@Value("${int-value}")
	private int intValue;

	public String getStrValue() {
		return strValue;
	}

	public int getIntValue() {
		return intValue;
	}
}
