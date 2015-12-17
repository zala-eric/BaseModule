package com.own.fm.log;

import java.util.Date;

import org.apache.log4j.Logger;



public class LogTest {
	final Logger log = Logger.getLogger(LogTest.class);
	
	public void test(){
		//log.debug("test:测试时间：");
		log.debug("test:测试时间："+new Date());
	}
	
	public static void main(String[] args) {
		LogTest test = new LogTest();
		test.test();
	}

}
