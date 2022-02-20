package backjoon;

import java.util.Scanner;

public class B4659 {
	
	public boolean f1(String pwd) {
		char[] arr_vowels = {'a','e','i','o','u'};
		int cnt_vowel = 0;
		for (int i = 0; i < pwd.length(); i++) {
			for (int j = 0; j < arr_vowels.length; j++) {
				if(pwd.charAt(i) == arr_vowels[j]) {
					cnt_vowel++;
				}
			}
		}
		if(cnt_vowel==0) {
			return false;
		}
		return true;
	}
	
	public boolean f2(String pwd) {
		char[] arr_vowels = {'a','e','i','o','u'};
		for (int i = 0; i < pwd.length(); i++) {
			for (int j = 0; j < arr_vowels.length; j++) {
				if(pwd.charAt(i) == arr_vowels[j]) {
					pwd = pwd.replace(String.valueOf(pwd.charAt(i)), "*");
				}
			}
			for (int j = 0; j < arr_vowels.length; j++) {
				if(pwd.charAt(i) != '*') {
					pwd = pwd.replace(String.valueOf(pwd.charAt(i)), "#");
				}
			}
		}
		for (int i = 0; i < pwd.length()-2; i++) {
			if(pwd.charAt(i)==pwd.charAt(i+1)&&pwd.charAt(i)==pwd.charAt(i+2)) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean f3(String pwd) {
		for (int i = 0; i < pwd.length()-1; i++) {
			if(pwd.charAt(i)==pwd.charAt(i+1)&&(pwd.charAt(i)!='e'&&pwd.charAt(i)!='o')) {
				return false;	
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B4659 b = new B4659();
		boolean[] arr_bool = new boolean[3];
		
		
		while(true) {
			String pwd = sc.next();
			if(pwd.equals("end")) break;
			
			arr_bool[0] = b.f1(pwd);
			arr_bool[1] = b.f2(pwd);
			arr_bool[2] = b.f3(pwd);
			
			if(arr_bool[0]&&arr_bool[1]&&arr_bool[2]) {
				System.out.printf("<%s> is acceptable.\n",pwd);
			} else {
				System.out.printf("<%s> is not acceptable.\n",pwd);
			}
			
		}
	}
}
