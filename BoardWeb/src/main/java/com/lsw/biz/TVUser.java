package com.lsw.biz;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new LgTV(); //or new LgTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
//		
//		LgTV tv = new LgTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
	}
}
