package di.anno;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("===> SonySpeaker κ°μ²΄ ??±");
	}
	/* (non-Javadoc)
	 * @see polymorphism.di.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker--?λ¦¬μΈλ¦°λ€.");
	}
	/* (non-Javadoc)
	 * @see polymorphism.di.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker--?λ¦¬λ΄λ¦°λ€.");
	}
}
