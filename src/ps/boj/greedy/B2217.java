package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B2217 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list,Collections.reverseOrder());
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<list.size(); i++) {
			List<Integer> tempList = list.subList(0, list.size()-i);
			// 내림차순 정렬 했기 때문에 최솟값 = tempList.get(tempList.size()-1)
			// Collections.min() 써서 시간초과 났었음
			int temp_max = tempList.get(tempList.size()-1)*tempList.size();
			if(temp_max>max) max = temp_max;
		}
		System.out.println(max);
	}
}
