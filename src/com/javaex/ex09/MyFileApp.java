package com.javaex.ex09;

import java.io.IOException;

public class MyFileApp {

	public static void main(String[] args) {
		
		
		MyFile mf = new MyFile();
		
		//정상
		mf.fileRead("c:/myfile.txt");
		
		//예외처리
		mf.fileRead2("c:/myfile.txt");
		
		
		//사용자가 예외처리
		try {
			mf.fileRead3("c:/myfile.txt");
		} catch(IOException e) {
			System.out.println("파일이 없습니다.");
		}

	}

}
