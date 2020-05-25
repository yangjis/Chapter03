package com.javaex.ex06;

//IOException에 대해 알아보자
//throw에 대해 알아보자

import java.io.IOException;

public class MyFileApp {

	public static void main(String[] args) {
		
		MyFile mf = new MyFile();
		
		mf.fileRead("c:\\myFile.exe");
		mf.fileRead2("aaaa");
		
		try {
			mf.fileRead3("aaaa");
		} catch (IOException e) {
			System.out.println("파일이 없습니다.@@@@@@@");
		}
	}
}
