package di.anno;

public class SonySpeaker implements Speaker { //sony타입과 speaker 타입이 같다 cf)객체가 메모리상 존재하지 않는다. nosearch bean
	public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성");
	}
	/* (non-Javadoc)
	 * @see polymorphism.di.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker--소리 올린다.");
	}
	/* (non-Javadoc)
	 * @see polymorphism.di.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker--소리 내린다.");
	}
}
