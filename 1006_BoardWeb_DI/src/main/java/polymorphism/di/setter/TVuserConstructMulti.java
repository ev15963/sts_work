package polymorphism.di.setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVuserConstructMulti {

	public static void main(String[] args) {
		// 1. Spring Container ���� 
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring Container�� ���� �ʿ��� ��ü�� ��û(lookup)�Ѵ�.
		TV tv=(TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring Container ����
		factory.close();
	}
}