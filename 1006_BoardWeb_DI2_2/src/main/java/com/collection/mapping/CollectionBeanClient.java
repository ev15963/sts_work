package com.collection.mapping;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		//1. Spring Container 구동
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring Container로 부터 필요한 객체 요청(lookup)
		CollectionBean bean =(CollectionBean) factory.getBean("collectionBean");
		Set<String> addressList = bean.getAddressList();
		for (String address : addressList) {
			System.out.println(address.toString());
		}
		factory.close();
	}
}
