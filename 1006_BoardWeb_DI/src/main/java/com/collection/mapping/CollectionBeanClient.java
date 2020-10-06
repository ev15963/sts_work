package com.collection.mapping;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		//1. Spring Container를 구동
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring Container로 부터 필요한 객체를 요청(lookup)한다.
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		List<String> addresslist = bean.getAddressList();
		
		//addressList => 서울, 경기
//						String String
//							0     1
		
		for(String address : addresslist) {
			System.out.println("===>"+address.toString());
		}
		
		//3. Spring Container 종료
		factory.close();
	}
	public CollectionBeanClient() {
		// TODO Auto-generated constructor stub
	}

}
