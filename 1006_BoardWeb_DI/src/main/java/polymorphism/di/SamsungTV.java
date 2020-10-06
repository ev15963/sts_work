package polymorphism.di;


public class SamsungTV implements TV{
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("============> SamsungTV ��ü ����");
	}
	
	
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV--���� �Ҵ�");
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
	