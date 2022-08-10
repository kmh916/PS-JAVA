package ps.boj.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 		N은 1000보다 작거나 같은 자연수
 * 		HashMap<String, Integer> 이용해서
 * 		입력 받을때
 * 		1. map이 해당 key값을 가지고 있으면 value+1해서 다시 넣기
 * 		2. 없으면 1넣기
 *
 * 		다 넣고 나면 value의 최대값구하고
 *
 * 		map.keySet을 list로 변환해서 정렬함(사전순 출력 해야함)
 * 		list를 돌면서 해당 String 값으로 map에서 꺼내서 max랑 같으면
 * 		출력 후 종료
 *
 *
 * */

public class B1302 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			String input = br.readLine();
			
			if(map.containsKey(input)) {
				map.replace(input,map.get(input)+1);
			} else {
				map.put(input,1);
			}
		}
		
		int max = Collections.max(map.values());
		
		List<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		
		for(String s : list) {
			if(map.get(s)==max) {
				System.out.println(s);
				break;
			}
		}
	}
}
