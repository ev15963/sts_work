package polymorphism.di.setter;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("===> SonySpeaker ��ü ����");
	}

	/* (non-Javadoc)
	 * @see polymorphism.construct.multi.di.change.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker--- �Ҹ� �︮��");
	}
	/* (non-Javadoc)
	 * @see polymorphism.construct.multi.di.change.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker--- �Ҹ� ������");
	}
}
