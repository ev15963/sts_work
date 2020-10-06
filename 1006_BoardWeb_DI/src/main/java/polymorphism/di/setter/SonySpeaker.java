package polymorphism.di.setter;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("===> SonySpeaker 按眉 积己");
	}

	/* (non-Javadoc)
	 * @see polymorphism.construct.multi.di.change.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker--- 家府 匡府促");
	}
	/* (non-Javadoc)
	 * @see polymorphism.construct.multi.di.change.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker--- 家府 郴赴促");
	}
}
