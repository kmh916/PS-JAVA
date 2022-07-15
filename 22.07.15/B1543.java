package b_1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String docs = br.readLine();
		String word = br.readLine();
		int cnt = 0;
		for(int i = 0; i<docs.length(); i++) {
			if(docs.contains(word)&&!word.equals("")) {
				docs = docs.replaceFirst(word, "*");
				cnt++;
				i = 0;
			}
		}
		System.out.println(cnt);
	}
}
