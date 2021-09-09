package com.douzone.paint.point;

import com.douzone.paint.i.Drawable;

public class Point implements Drawable {
	private int x;
	private int y;

	//Point 기본생성자를 overloading으로 추가 -> 상속받는 ColorPoint의 생성자 오류 해결
	public Point() {
		
	}
	
	//생성자를 만들었기 때문에 이제부턴 기본 생성자Point가 없어짐 -> 파라미터를 필수로하는 생성자메서드
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show() {
		System.out.println("점[x=" + x + ", y= " + y + "]을 그렸습니다.");
	}
	
	public void show(boolean visible) {
		if(visible) {
			//System.out.println("점[x=" + x + ", y= " + y + "]을 그렸습니다.");
			//중복제거 (오버라이드 중복 제거)
			show();
		} else {
			System.out.println("점[x=" + x + ", y= " + y + "]을 지웠습니다.");
		}
	}
	
	@Override
	public void draw() {
		show();
		
	}
	
//	public void disapear() {
//		System.out.println("점[x=" + x + ", y= " + y + "]을 지웠습니다.");
//	}

}
