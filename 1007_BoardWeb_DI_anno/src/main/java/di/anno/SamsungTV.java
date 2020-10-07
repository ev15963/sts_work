package di.anno;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체?��?��");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ?���?");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() ?���?");
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV-- ?��?��켠다 (�?�? : "+ price +")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV-- ?��?��?��?��");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public int getPrice() {
		return price;
	}
	
}
