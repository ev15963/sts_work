package com.collection.mapping;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
	AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
	
	CollectionBean bean=(CollectionBean)factory.getBean("collectionBean");
	
	Properties addressList=bean.getAddressList();
	
	Enumeration enu=addressList.propertyNames();
	
	while(enu.hasMoreElements()){
		String ele=(String)enu.nextElement();
		System.out.println(ele + " : " + addressList.getProperty(ele));
	}
	
	

//	Set<Map.Entry<String, String>> entrySet=addressList.entrySet();
//	
//	Iterator<Map.Entry<String, String>> entryIterator=entrySet.iterator();
//	
//	while(entryIterator.hasNext()){
//		Map.Entry<String, String> entry=entryIterator.next();
//		String key=entry.getKey();
//		String value=entry.getValue();
//		System.out.println(key + " : " + value);
//	}
	
	
	
	
//	Set<String> keySet=addressList.keySet();
//	
//	Iterator<String> keyIterator=keySet.iterator();
//	while(keyIterator.hasNext()){
//		String key=keyIterator.next();
//		String value=addressList.get(key);
//		System.out.println(key+ " : " +value);
//	}
//	
	
//	System.out.println("�� Entry �� : "+ addressList.size());
//	
//	System.out.println("��浿�� ��� ����? "+ addressList.get("��浿"));
//	System.out.println("�������� ��� ����? "+ addressList.get("������"));	

	factory.close();
	}

}
