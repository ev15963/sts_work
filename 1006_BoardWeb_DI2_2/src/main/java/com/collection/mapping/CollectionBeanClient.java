package com.collection.mapping;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		//1. Spring Container 구동
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring Container로 부터 필요한 객체 요청(lookup)
		CollectionBean bean =(CollectionBean) factory.getBean("collectionBean");
		Map<String, String> addressList = bean.getAddressList();
		
		//map은 객체하나씩 처리
		System.out.println("고길동의 전체 주소는? : " + addressList.get("고길동"));
		System.out.println("마이콜의 전체 주소는? : " + addressList.get("마이콜"));
		System.out.println("아무개의 전체 주소는? : " + addressList.get("아무개"));
		
		factory.close();
	}
}
