package com.javaex.ex09;

import java.io.IOException;

public class MyFile {

	// 정상적인 경우
	public void fileRead(String filePath) {
		String file = "학교종이 땡땡땡 어서 모이자 선생님이 우리를 기다리신다";
		System.out.println(file);
	}

	// 파일이 없는경우(예외처리 된 경우)
	public void fileRead2(String filePath) {
		try {
			throw new IOException(); // 강제로 예외 발생
		} catch (Exception e) {
			// System.out.println(e);
			System.out.println("error");
		}
	}

	// 파일이 없는경우(예외처리를 던진 경우-->사용자가 예외처리하도록 코딩)
	public String fileRead3(String filePath) throws IOException {
		throw new IOException(); // 강제로 예외 발생
	}

}