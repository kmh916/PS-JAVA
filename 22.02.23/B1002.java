package backjoon;

import java.util.Scanner;

public class B1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < t; i++) {
			String input = sc.nextLine();
			int x1 = Integer.parseInt(input.split(" ")[0]);
			int y1 = Integer.parseInt(input.split(" ")[1]);
			int r1 = Integer.parseInt(input.split(" ")[2]);
			int x2 = Integer.parseInt(input.split(" ")[3]);
			int y2 = Integer.parseInt(input.split(" ")[4]);
			int r2 = Integer.parseInt(input.split(" ")[5]);
			
			//두 좌표 사이의 거리
			double dist = Math.sqrt((Math.pow(x1-x2,2)+Math.pow(y1-y2, 2)));
			
			if(dist>Math.abs(r1-r2)&&dist<r1+r2) {
				//두점에서 만나는경우
				System.out.println(2);
			} else if(dist==r1+r2||dist==Math.abs(r1-r2)) {
				if(dist!=0) {
					//외접, 내접
					System.out.println(1);
				} else {
					//같은 원일경우
					System.out.println(-1);
				}
			} else if(dist>r1+r2||dist<Math.abs(r1-r2)) {
				// 만나지 않는경우
				System.out.println(0);
			} else if(dist == 0) {
				//좌표가 일치하고 반지름 길이가 다를경우
				System.out.println(0);
			}
	
		}
		
		
		
	}
}
