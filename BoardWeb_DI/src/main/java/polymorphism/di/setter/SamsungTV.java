package polymorphism.di.setter;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println(">>>>> SaumsungTV(1) 객체 생성");
	}
	
	
	public void powerOn(){
		System.out.println(">>>>>SamsungTV TV전원을 켠다. (가격 : " +price+ ")");
	}
	
	public void powerOff(){
		System.out.println(">>>>>SamsungTV TV전원을 끈다");
	}
	
	public void volumeUp(){
		speaker.volumeUp();
	}
	
	public void volumeDown(){
		speaker.volumeDown();
	}


	public void setSpeaker(Speaker speaker) {		
		this.speaker = speaker;
		System.out.println(">>>>>speaker setter 호출");
	}


	public void setPrice(int price) {
		this.price = price;
		System.out.println(">>>>>price setter 호출");
	}

}
