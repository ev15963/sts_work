package polymorphism.di.change;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println(">>>>>SonySpeker ��ü ����");
		
	}

	/* (non-Javadoc)
	 * @see polymorphism.di.change.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp(){
		System.out.println(">>>>>SonySpeaker -- �Ҹ� �ø�");
		
	}

	/* (non-Javadoc)
	 * @see polymorphism.di.change.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown(){
		System.out.println(">>>>>SonySpeaker -- �Ҹ� ����");
		
	}

}
