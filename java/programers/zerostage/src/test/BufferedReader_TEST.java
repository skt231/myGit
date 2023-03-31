package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_TEST {
	public static void main(String[] args) throws IOException {
		BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
		String a = sr.readLine();
		String b = sb.readLine();//Buffered String을 기본
		int c = Integer.parseInt(b);// int
		System.out.println(a);
		System.out.println(c);
	}
}
