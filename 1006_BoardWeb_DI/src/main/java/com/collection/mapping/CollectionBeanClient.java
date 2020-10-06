package com.collection.mapping;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		//1. Spring Container�� ����
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring Container�� ���� �ʿ��� ��ü�� ��û(lookup)�Ѵ�.
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		Properties addresslist = bean.getAddressList();
		
		//addressList => ����, ���
//						String String
//							0     1 set���� ������ ���� ������ �����
		
		//name ��������
		Enumeration enu = addresslist.propertyNames(); //kerSet() �޼ҵ�� ����� ����
		//���� Ÿ���� Enumeration�� EnumerationŸ���� ������ �����.  


		while (enu.hasMoreElements()) {
			String ele=(String)enu.nextElement();
			System.out.println(ele + " : " + addresslist.getProperty(ele));
		}
		
		//3. Spring Container ����
		factory.close();
		
	
	}
//	public CollectionBeanClient() {
//		// TODO Auto-generated constructor stub
//	}

}