package polymorphism.di.change;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("============> SamsungTV ��ü ����");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) ��ü ����");
		this.speaker=speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
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
	public void volumeUp() { // �����ڸ� ���ؼ� ����
		this.speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		this.speaker.volumeDown();
//		System.out.println("SamsungTV--�Ҹ� ������");
	}
}
	