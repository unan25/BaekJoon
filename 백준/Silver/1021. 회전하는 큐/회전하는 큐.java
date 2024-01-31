import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
2번 연산 : 반시계 방향
3번 연산 : 시계 방향
 */

public class Main {
    
    static LinkedList<Integer> deque = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        // 뽑고자 하는 수, 리스트
        List<Integer> list = new ArrayList<>();
        
        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (check(list.get(i))) { // 2번 연산 (true)
                while (list.get(i) != deque.get(0)) {
                    deque.addLast(deque.pollFirst());
                    count++;
                }
            } else { // 3번 연산 (false)
                while (list.get(i) != deque.get(0)) {
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst(); // 연산 후 원소 삭제
        } // for(i)

        System.out.println(count);

        br.close();
    }

    /*
     2, 3번 연산 판별 메서드
     deque.size() 보다 작으면 2번 아니면 3번
     */
    static boolean check(int n) {
        for (int i = 0; i <= deque.size() / 2; i++) {
            if (n == deque.get(i)) return true;
        }
        return false;
    }
}
