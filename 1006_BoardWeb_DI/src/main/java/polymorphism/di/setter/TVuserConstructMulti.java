package polymorphism.di.setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVuserConstructMulti {

	public static void main(String[] args) {
		// 1. Spring Container 구동 
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring Container로 부터 필요한 객체를 요청(lookup)한다.
		TV tv=(TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring Container 종료
		factory.close();
	}
}
