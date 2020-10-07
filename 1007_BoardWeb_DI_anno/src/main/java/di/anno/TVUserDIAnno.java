package di.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUserDIAnno {
	public static void main(String[] args) {
		
		//1.  Spring Container를 구동
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring Container로 부터 필요한 객체를 요창(Lookup)
		TV tv=(TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

//		TV tv1 = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv");
//		TV tv3 = (TV)factory.getBean("tv");
//		
		//3. Spring Container 종료
		factory.close();
		
	}
}

