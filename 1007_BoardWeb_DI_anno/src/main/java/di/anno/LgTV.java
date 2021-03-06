package di.anno;

import org.springframework.stereotype.Component;

@Component			//메모리상 저장
public class LgTV implements TV{ //lgtv의 부모 TV와 일치 하지 않는다
//	@Resource(name="apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> lgtv 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("LgTV-- 전원을 켠다");
	}

	public void powerOff() {
		System.out.println("LgTV-- 전원을 끈다");
	}

	public void volumeUp() {
		this.speaker.volumeUp();
	}

	public void volumeDown() {
		this.speaker.volumeDown();
	}
	
	

}
