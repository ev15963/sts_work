package polymorphism.di;


public class SamsungTV implements TV{
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("============> SamsungTV 객체 생성");
	}
	
	
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV--전원 켠다");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV--전원 끈다");
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
//		System.out.println("SamsungTV--소리 내린다");
	}
}
	