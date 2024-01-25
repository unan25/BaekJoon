import java.io.*;
import java.util.*;

/*
    R : 배열 순서 뒤집기
    D : 첫 번째 수 버리기
    ex) RDD : 배열 뒤집고 처음 두 수 버리기
    result = 덱에 남은 수 출력
    덱이 비어 있는데 D 사용한 경우 "error" 출력

    ex) RDD
        4
        [1,2,3,4]
        R : [4, 3, 2, 1] -> D : [3, 2, 1] -> D : [2, 1] = result

        17:25 ~ 18:05
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스

        for (int i = 0; i < T; i++) {
            String command = br.readLine(); // 명령어 ex) RDD
            int n = Integer.parseInt(br.readLine()); // 배열 길이
            StringTokenizer st = new StringTokenizer(br.readLine(), "[ , ]");
            Deque<String> deque = new ArrayDeque();

            // 덱 초기화
            while (st.hasMoreTokens()) {
                deque.add(st.nextToken());
            }

            boolean isError = false;
            boolean reverse = false; // R 연산 여부를 저장하는 변수

            for (char s : command.toCharArray()) {
                switch (s) {
                    case 'R':
                        reverse = !reverse; // R 연산 반전
                        break;
                    case 'D':
                        if (deque.isEmpty()) {
                            isError = true;
                            break;
                        } else {
                            if (reverse) {
                                deque.removeLast();
                            } else {
                                deque.removeFirst();
                            }
                        }
                        break;
                }
            }

            if (isError) {
                sb.append("error\n");
            } else {
                sb.append("[");
                if (reverse) {
                    while (!deque.isEmpty()) {
                        sb.append(deque.removeLast());
                        if (!deque.isEmpty()) {
                            sb.append(",");
                        }
                    }
                } else {
                    while (!deque.isEmpty()) {
                        sb.append(deque.removeFirst());
                        if (!deque.isEmpty()) {
                            sb.append(",");
                        }
                    }
                }
                sb.append("]\n");
            }
        }

        System.out.println(sb.toString().trim());
        br.close();
    }
}
