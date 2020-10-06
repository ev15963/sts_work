package polymorphism.di.setter;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("============> SamsungTV 객체 생성");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker=speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price=price;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV--전원 켠다, (가격 : "+this.price+")");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV--전원 끈다");
	}
	@Override
	public void volumeUp() { // 생성자를 통해서 들어옴
		this.speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		this.speaker.volumeDown();
//		System.out.println("SamsungTV--소리 내린다");
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public int getPrice() {
		return price;
	}
}
	