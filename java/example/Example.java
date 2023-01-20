package example;

import java.util.Arrays;

public class Example {

	String message = "기본생성자";
	int code = 100;
	int[] nums = new int[10];

//	Example() {
//		System.out.println("test1: " + message + " " + code);
//	};
//
//	Example(String message) {
//		
//		System.out.println("test2: " + message + " " + code);
//	};
//
//	Example(String message, int code) {
//		System.out.println("test3: " + message + " " + code);
//	};
//
//	void m1() {	};
//	void m1(int n) {
//		System.out.println(n);
//	}
//	void m1(int n,boolean b) {
//		System.out.println(n+"은 "+ b+"입니다." );
//	}
//	void m1(boolean b, int n) {
//		System.out.println(n+"은 "+ b+"입니다." );
//		
//	}

	String getMessage() {

		return message;
	}

	void setMessage(String s) {
		message = s;
		System.out.println(message);
	}

	int getCode() {
		return code;
	}

	void setCode(int c) {
		code = c;
	}

	int[] getNums() {

		return (nums);
	}

	void setNums(int index, int changeNum) {
		nums[index] = changeNum;

	}

	void printNums() {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}

	void printNums(int startIndex) {
		for (int i = startIndex; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
//	---------------------------------------------------------

}
