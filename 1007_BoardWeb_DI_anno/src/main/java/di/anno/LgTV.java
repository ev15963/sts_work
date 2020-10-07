package di.anno;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("tv")			//�޸𸮻� ����
public class LgTV implements TV{ //lgtv�� �θ� TV�� ��ġ ���� �ʴ´�
	@Resource(name="apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> lgtv ��ü ����");
	}
	
	public void powerOn() {
		System.out.println("LgTV-- ������ �Ҵ�");
	}

	public void powerOff() {
		System.out.println("LgTV-- ������ ����");
	}

	public void volumeUp() {
		this.speaker.volumeUp();
	}

	public void volumeDown() {
		this.speaker.volumeDown();
	}
	
	

}