package polymorphism.di;

public class TVUser {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory(); //BeanFactory : samsung or TV 선택하게

		TV tv = (TV)factory.getBean(args[0]);
		
//		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
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
