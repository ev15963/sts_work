package com.lsw.biz;

public class SamsungTV implements TV{
	public SamsungTV() {
		System.out.println("============> SamsungTV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV--전원 켠다");
	}
	public void powerOff() {
		System.out.println("SamsungTV--전원 끈다");
	}
	public void volumeUp() {
		System.out.println("SamsungTV--소리 울린다");
	}
	public void volumeDown() {
		System.out.println("SamsungTV--소리 내린다");
	}
}
