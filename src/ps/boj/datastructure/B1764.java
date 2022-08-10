package ps.boj.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
 * 		1.듣도 못한놈 입력받고 컬렉션에 저장
 * 		2.보도못한놈 입력받을때 그 값이 듣도 못한놈 컬렉션에 있으면 듣보잡임
 *
 * 		여기서!!!!
 * 		ArrayList.contains는 시간 복잡도가 O(n)이고
 * 		Hashset.contains는 시간 복잡도가 O(1)이라서
 * 		듣도 못한놈을 List로 구현하면 전체 시간 복잡도가 O(N^2)이 되므로 시간초과나기 때문에
 *      Hashset을 사용해야함
 *
 * */

public class B1764 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i<n;i++) {
			set.add(br.readLine());
		}
		
		for(int i=0; i<m;i++) {
			String str = br.readLine();
			if(set.contains(str)) {
				list.add(str);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		list.forEach(System.out::println);
	}
}
