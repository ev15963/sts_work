package di.anno;

public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("==> AppleSpeaker ��ü����");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker---�Ҹ� �︰��.");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker---�Ҹ� ������.");
	}
	
	
}