package polymorphism.di;

public class SamsungTV implements TV {
	private SonySpeaker speaker;

	public SamsungTV() {
		System.out.println("===> SamsungTV-- 객체생성");
	}

	public void powerOn() {
		System.out.println("SamsungTV-- 전원켠다");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV-- 전원끈다");
	}

	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
	
}
