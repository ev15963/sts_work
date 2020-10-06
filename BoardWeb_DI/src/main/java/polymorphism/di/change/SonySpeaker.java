package polymorphism.di.change;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println(">>>>>SonySpeker 按眉 积己");
		
	}

	/* (non-Javadoc)
	 * @see polymorphism.di.change.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp(){
		System.out.println(">>>>>SonySpeaker -- 家府 棵覆");
		
	}

	/* (non-Javadoc)
	 * @see polymorphism.di.change.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown(){
		System.out.println(">>>>>SonySpeaker -- 家府 郴覆");
		
	}

}
