package polymorphism.di.setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import polymorphism.di.setter.TV;

public class TVuserDISetter {


	public static void main(String[] args) {
		// 1. Spring Container�� ����
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
																			//applicationContext.xml�� id������ tv�� ���� �Ʊ� ������ �� �������� tv�� ������
																			//name������ ������ ��� �޼ҵ� �����ϸ� ������
		// 2. Spring Container�� ���� �ʿ��� ��ü�� ��û(lookup)�Ѵ�.
		TV tv=(TV)factory.getBean("tv");
							//getBean�� ��ȯŸ���� object�� ����ȯ�� �ʿ��ϴ�
							//SamsungTv�� TV�������̽��� ���� �޾ұ� ������ TV�� ���� �� �ִ�.
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		//3. Spring Container ����
		factory.close();

	}

}
