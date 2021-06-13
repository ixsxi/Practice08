package com.javaex.ex08;

import java.util.Scanner;





public class FriendApp {

	public static void main(String[] args) {
		
		Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        
        System.out.println("친구를 3명 등록해 주세요");

        
            for(int i=0; i<friendArray.length; i++) {
        	
	            String list = sc.nextLine();
	            String[] listArray = list.split(" ");
	            
	        	
	        	Friend User = new Friend();
	        	User.setName(listArray[0]);
	        	User.setHp(listArray[1]);
	        	User.setSchool(listArray[2]);
	        	
	        	friendArray[i] = User;
        	
        		}
            
              
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo();
        }
		
		
		
		
		/* 
		System.out.println("친구 3명을 등록해주세요");
		
		
		String user1 = sc.nextLine();
		String user2 = sc.nextLine();
		String user3 = sc.nextLine();
		
		String[] userArray1 = user1.split(" ");
		String[] userArray2 = user2.split(" ");
		String[] userArray3 = user3.split(" ");
		
		System.out.println("이름:" + userArray1[0] + " 핸드폰:" + userArray1[1] + " 학교:" + userArray1[2]);
		System.out.println("이름:" + userArray2[0] + " 핸드폰:" + userArray2[1] + " 학교:" + userArray2[2]);
		System.out.println("이름:" + userArray3[0] + " 핸드폰:" + userArray3[1] + " 학교:" + userArray3[2]);
		*/
	}

}
