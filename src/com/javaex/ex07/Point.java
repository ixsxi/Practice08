package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) { // 기존오브젝트메소드를 자신에 맞게 설정
		if(this.x == ((Point)obj).x) { //this.x 자신의 x의 point까지 시야 확보 
			return true;
		}else{
		return false;
	}

	//equals() 메소드를 작성하세요.
	/*
	public boolean equals(Object obj) {
		 Point p = ((Point)obj);
		if(this.x == p.x  ) {
			 return true;
		 }else {
			 return false;
		 }	
		
	}
*/
	
	
	
}
}
