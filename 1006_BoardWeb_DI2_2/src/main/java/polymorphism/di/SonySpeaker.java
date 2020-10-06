package polymorphism.di;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성");
	}
	/* (non-Javadoc)
	 * @see polymorphism.di.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker--소리울린다.");
	}
	/* (non-Javadoc)
	 * @see polymorphism.di.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker--소리내린다.");
	}
}
