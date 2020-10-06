package polymorphism.di;

public class SamsungTV implements TV {

	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println(">>>>> SaumsungTV ��ü ����");
	}
	
	public void powerOn(){
		System.out.println(">>>>>SamsungTV TV������ �Ҵ�");
	}
	
	public void powerOff(){
		System.out.println(">>>>>SamsungTV TV������ ����");
	}
	
	public void volumeUp(){
		speaker=new SonySpeaker();
		speaker.volumeUp();
	}
	
	public void volumeDown(){
		speaker=new SonySpeaker();
		speaker.volumeDown();
	}

}
