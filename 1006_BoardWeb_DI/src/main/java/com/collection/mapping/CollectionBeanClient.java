package com.collection.mapping;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		//1. Spring Container를 구동
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring Container로 부터 필요한 객체를 요청(lookup)한다.
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		Map<String, String> addresslist = bean.getAddressList();
		
		//addressList => 서울, 경기
//						String String
//							0     1 set에선 순서가 없기 때문에 사라짐
		
		//객체를 하나씩 처리하기
		Set<String> keySet = addresslist.keySet(); //key Set 얻기
		
		//반복해서 키를 얻어내고 그 키로 값을 Map에서 얻어낸다.
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key=keyIterator.next();
			String value = addresslist.get(key);
			System.out.println(key + " : " + value);
		}
		
		//3. Spring Container 종료
		factory.close();
		
	
	}
	public CollectionBeanClient() {
		// TODO Auto-generated constructor stub
	}

}
