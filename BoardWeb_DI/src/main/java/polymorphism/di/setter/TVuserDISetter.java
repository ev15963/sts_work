package polymorphism.di.setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import polymorphism.di.setter.TV;

public class TVuserDISetter {


	public static void main(String[] args) {
		// 1. Spring Container를 구동
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
																			//applicationContext.xml에 id값으로 tv가 설정 됐기 때문에 현 시점에서 tv가 생성됨
																			//name값으로 설정할 경우 메소드 실행하며 생성됨
		// 2. Spring Container로 부터 필요한 객체를 요청(lookup)한다.
		TV tv=(TV)factory.getBean("tv");
							//getBean의 반환타입은 object로 형변환이 필요하다
							//SamsungTv는 TV인터페이스를 구현 받았기 때문에 TV로 받을 수 있다.
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		//3. Spring Container 종료
		factory.close();

	}

}
