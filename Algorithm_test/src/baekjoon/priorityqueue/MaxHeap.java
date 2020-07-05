package baekjoon.priorityqueue;

// #11279
import java.io.*;
import java.util.*;

public class MaxHeap {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new PriorityQueue<>();
		
//		Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//		�̷����ϸ� poll()�� add()���� -1������ ���ص� �ȴ�.
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			if (k == 0) {
				if (q.isEmpty()) {
					sb.append(0 + "\n");
				} else {
					// �ٽ� -1�� ���ؼ� ���� �Է¹޾Ҵ� ������ ���
					sb.append(q.poll() * -1 + "\n");
				}
			} else {
				// �ִ��� �־�� �ϹǷ� -1�� ���ؼ� �Ǿտ� ū���ڰ� �;ߵ� 
				q.add(k * -1);
			}
			
//			System.out.println(q);
		}
		System.out.print(sb.toString());
	}
}
