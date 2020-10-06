package polymorphism.construct;

public class SamsungTV implements TV {

	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println(">>>>> SaumsungTV ��ü ����");
	}
	
	public SamsungTV(SonySpeaker speaker){
		System.out.println(">>>>> SamsungTV(2) ��ü ����");
		this.speaker=speaker;
	}
	
	public void powerOn(){
		System.out.println(">>>>>SamsungTV TV������ �Ҵ�");
	}
	
	public void powerOff(){
		System.out.println(">>>>>SamsungTV TV������ ����");
	}
	
	public void volumeUp(){
		speaker.volumeUp();
	}
	
	public void volumeDown(){
		speaker.volumeDown();
	}

}
