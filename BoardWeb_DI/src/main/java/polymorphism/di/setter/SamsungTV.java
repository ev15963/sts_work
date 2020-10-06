package polymorphism.di.setter;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println(">>>>> SaumsungTV(1) ��ü ����");
	}
	
	
	public void powerOn(){
		System.out.println(">>>>>SamsungTV TV������ �Ҵ�. (���� : " +price+ ")");
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


	public void setSpeaker(Speaker speaker) {		
		this.speaker = speaker;
		System.out.println(">>>>>speaker setter ȣ��");
	}


	public void setPrice(int price) {
		this.price = price;
		System.out.println(">>>>>price setter ȣ��");
	}

}
