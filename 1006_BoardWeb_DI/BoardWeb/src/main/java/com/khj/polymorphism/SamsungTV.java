package com.khj.polymorphism;

public class SamsungTV implements TV {

	public SamsungTV(){
		System.out.println("=====>SamsungTV ��ü ����");
	}
	

	public void powerOn(){
		System.out.println("SamsungTV----���� �Ҵ�.");
	}
	
	public void powerOff(){
		System.out.println("SamsungTV----���� ����.");
	}
	
	public void volumeUp(){
		System.out.println("SamsungTV----�Ҹ� �ø���.");
	}
	
	public void volumeDown(){
		System.out.println("SamsungTV----�Ҹ� ������.");
	}
	

}