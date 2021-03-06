package di.anno;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) κ°μ²΄??±");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ?ΈμΆ?");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() ?ΈμΆ?");
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV-- ? ?μΌ λ€ (κ°?κ²? : "+ price +")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV-- ? ???€");
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
