package kakao.winter;

import java.util.Arrays;

//	2019 īī�� ������ �ܿ� ���Ͻ� �ڵ��׽�Ʈ #4 ȣ�� �� ����
//	[�� ������ ��Ȯ���� ȿ���� �׽�Ʈ ���� ������ �ִ� �����Դϴ�.]

// 	      ����� ����
//		k	room_number		result
//		10	[1,3,4,1,3,1]	[1,3,4,2,5,6]


//	ȿ���� �׽�Ʈ ��� ����
//	���� 200000�� ���� ���� ����� ���� �ʹ� ���� �ð��ʰ�
//  HashMap�� �̿��ؼ� �湮�� �� ��忡 �θ� �� ����

public class Kakao04 {

	public static void main(String[] args) {

		long[] room_number = { 1, 3, 4, 1, 3, 1 };
		System.out.println(Arrays.toString(solution(10, room_number)));
	}

	public static long[] solution(long k, long[] room_number) {

		boolean[] check = new boolean[(int) k + 1];
		long[] answer = new long[room_number.length];
		int idx = 0;
		int p = 0;
		for (long i : room_number) {
			int room = (int) i;
			if (!check[room]) {
				check[room] = true;
				answer[idx++] = room;
			} else {
				p = room+1;
				while (true) {
					if (!check[p]) {
						check[p] = true;

						answer[idx++] = p;
						break;
					}
					p++;
				}
			}
			
			
			
		}
		
		return answer;
	}

}
