package di.anno;

public class SonySpeaker implements Speaker { //sonyŸ�԰� speaker Ÿ���� ���� cf)��ü�� �޸𸮻� �������� �ʴ´�. nosearch bean
	public SonySpeaker() {
		System.out.println("===> SonySpeaker ��ü ����");
	}
	/* (non-Javadoc)
	 * @see polymorphism.di.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker--�Ҹ� �ø���.");
	}
	/* (non-Javadoc)
	 * @see polymorphism.di.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker--�Ҹ� ������.");
	}
}
