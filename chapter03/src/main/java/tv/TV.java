package tv;

public class TV {
	
	private int channel;		//1~255
	private int volume;			//0~100
	private boolean power;		//ON, OFF
	
	//getter 메서드 구현
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}
	
	public boolean isPower() {
		return power;
	}

	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}
	
	public TV(int channel, int volumen, boolean power) {
		this.channel = channel;
		this.volume = volumen;
		this.power = power;
	}
	
	
	//TV 전원
	public void power(boolean power) {
		this.power = power;
	}
	
	//볼륨 직접 입력
	public void volume(int num) {
		if(num > 100) {
			num = 100;
		} else if (num < 0) {
			num = 0;
		}
		this.volume = num;
	}
	
	//볼륨 up, down
	public void volume(boolean check) {
		volume(volume + (check ? 1: -1));
	}

	//채널 직접 입력
	public void channel(int num) {
		if(num > 255) {
			num = 255;
		} else if (num < 1) {
			num = 1;
		}
		this.channel = num;
	}
	
	//채널 up, down
	public void channel(boolean check) {
		channel(channel + (check ? 1: -1));
	}
	
	
 	
}
