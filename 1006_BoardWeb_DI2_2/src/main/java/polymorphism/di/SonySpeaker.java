package polymorphism.di;

public class SonySpeaker {
	public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성");
	}
	public void volumeUp() {
		System.out.println("SonySpeaker--소리울린다.");
	}
	public void volumeDown() {
		System.out.println("SonySpeaker--소리내린다.");
	}
}
