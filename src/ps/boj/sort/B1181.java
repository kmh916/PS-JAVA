package ps.boj.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 		Hashset으로 입력받아서 중복을 제거시키고
 * 		Set -> List 로 변환하고
 *		Collections.sort()로 정렬시키는데, Comparator 직접 구현하여 넣어주기
 *
 * 		Comparator.compare(p1,p2)
 * 		=> p1이 더 크면(오른쪽으로 가야하면) 양수를 리턴하기
 *      => p1 p2가 같으면 0 리턴하기
 *      => p1이 작으면(왼쪽으로 가야하면) 음수를 리턴하기
 *
 * */

public class B1181 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		for(int i = 0; i<n;i++) {
			set.add(br.readLine());
		}
		
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list,new MyCompartor());
		list.forEach(System.out::println);
	}
}

class MyCompartor implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()>o2.length()) {
			// ���ڿ� ���̰� �� ��� �� ŭ(���������� �̵�) 
			return 1;
		} else if(o1.length()==o2.length()) {
			// ���ڿ� ���̰� ���� �� ���� �ϳ��� Ȯ���ϸ鼭 ��
			for(int i = 0; i<o1.length();i++) {
				if(o1.charAt(i)>o2.charAt(i)) {
					return 1;
				} else if(o1.charAt(i)<o2.charAt(i)) {
					return -1;
				}
			}
			// �ݺ� �� ���Ҵµ� ���� �ȵǸ� ���ڰ� ���ٴ� �� �ߺ� �����ؼ� ���� �� ���� ������
			return 0;
		} 
		// else �� ��� (���ڿ��� �� ª��) ���� ����
		return -1;
	}
	
}
