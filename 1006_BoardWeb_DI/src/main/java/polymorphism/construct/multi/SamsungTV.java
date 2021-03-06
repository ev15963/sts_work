package polymorphism.construct.multi;

import polymorphism.construct.SonySpeaker;

public class SamsungTV implements TV{
	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("============> SamsungTV ��ü ����");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) ��ü ����");
		this.speaker=speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("====> SamsungTV(3) ��ü ����");
		this.speaker = speaker;
		this.price=price;
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV--���� �Ҵ�, (���� : "+this.price+")");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV--���� ����");
	}
	@Override
	public void volumeUp() {
		speaker=new SonySpeaker();
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
//		System.out.println("SamsungTV--�Ҹ� ������");
	}
}
	