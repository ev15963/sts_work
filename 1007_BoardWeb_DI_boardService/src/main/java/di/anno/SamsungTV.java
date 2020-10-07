package di.anno;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) Í∞ùÏ≤¥?Éù?Ñ±");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ?ò∏Ï∂?");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() ?ò∏Ï∂?");
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV-- ?†Ñ?õêÏº†Îã§ (Í∞?Í≤? : "+ price +")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV-- ?†Ñ?õê?Åà?ã§");
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
