package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.println(">>");
    		String user = sc.nextLine(); //user 값 저장
    		
    		String[] uArray = user.split(" "); // 배열로 만듬 " " 기준으로
    	int	a  = Integer.parseInt(uArray[0]); //uArray 1번방 --> 인트로 변환
    	int	b   = Integer.parseInt(uArray[2]);
    		
    		
    		if(user.equals("/q")) {
    			System.out.println("종료");
    			break;
    			
    		}else if(uArray[1].equals("+")) {
    			
    			Add add = new Add(); // 메모리 올리기 들어갈수있는 권한
    			add.setValue(a, b);
    			//System.out.println(a + b);
    			System.out.println(add.calculate());
    			
    		}else if(uArray[1].equals("-")) {
    			
    			Div div = new Div();
    			div.setValue(a, b);
    			System.out.println(div.calculate());
    			
    		}else if(uArray[1].equals("*")) {
    			Mul mul = new Mul();
    			mul.setValue(a, b);
    			System.out.println(mul.calculate());
    			
    			
    		}else if(uArray[1].equals("/")) {
    			Sub sub = new Sub();
    			sub.setValue(a, b);
    			System.out.println(sub.calculate());
    			
    		}else {
    			System.out.println("오류입니다.");
    		}
    		
    		
    	}
    	sc.close();
    }
}
