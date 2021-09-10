package prob2;

public class SmartPhone extends MusicPhone {

	public SmartPhone() {
		
	}
	
	public void execute (String function) {
		if(function.equals("앱")) {
			playApp();
			
			return;
			
		} else if(function.equals("음악")) {
			downloadMusic();
		} else {
			super.execute(function);
		}
	
	}
	
	private void downloadMusic() {
		System.out.println("다운로드해서 음악재생");

	}
	
	private void playApp() {
		System.out.println("앱실행");
	}
	
//	private void playMusic() {
//		System.out.println( "통화기능시작" );
//
//	}
	
}
