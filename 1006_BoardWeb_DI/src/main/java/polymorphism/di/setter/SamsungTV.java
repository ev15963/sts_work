package polymorphism.di.setter;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("============> SamsungTV ��ü ����");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ȣ��");
		this.speaker=speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice() ȣ��");
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

	public Speaker getSpeaker() {
		return speaker;
	}

	public int getPrice() {
		return price;
	}
}
	