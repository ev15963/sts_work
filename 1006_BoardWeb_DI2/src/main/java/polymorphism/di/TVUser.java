package polymorphism.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		
		//1.  Spring 컨테이너를 구동
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring 컨테이너로부터 필요한 객체 요청(Lookup)
//		TV tv=(TV)factory.getBean("tv");
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();

		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		TV tv3 = (TV)factory.getBean("tv");
		
		//3. Spring 컨테이너 종료
		factory.close();
		
//		BeanFactory factory = new BeanFactory(); //BeanFactory : samsung or TV 선택하게
//
//		TV tv = (TV)factory.getBean(args[0]);
//		
////		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		//그냥 실행시 
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
//		at polymorphism.di.TVUser.main(TVUser.java:7)
		
//		arguments >lg or samsung 선택
		
//		TV tv = new LgTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
	}
}
