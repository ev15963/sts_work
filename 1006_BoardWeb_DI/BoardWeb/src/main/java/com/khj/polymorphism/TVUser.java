package com.khj.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.khj.polymorphism.*;

public class TVUser {


	public static void main(String[] args) {
//		TV tv=new LgTV();
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
//		BeanFactory factory=new BeanFactory();
//		TV tv=(TV)factory.getBean(args[0]);
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
//
		
		//1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)
		TV tv=(TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring 컨테이너 종류
		factory.close();
		
	}

}
