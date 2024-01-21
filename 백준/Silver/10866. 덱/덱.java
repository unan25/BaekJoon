import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*
걸린시간 : 15분
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String command = st.nextToken();
                switch (command) {
                    case "push_front":
                        deque.addFirst(Integer.parseInt(st.nextToken()));
                        break;
                    case "push_back":
                        deque.addLast(Integer.parseInt(st.nextToken()));
                        break;
                    case "pop_front":
                        if (deque.isEmpty()) {
                            System.out.println("-1");
                            break;
                        } else {
                            System.out.println(deque.pollFirst());
                            break;
                        }
                    case "pop_back":
                        if (deque.isEmpty()) {
                            System.out.println("-1");
                            break;
                        } else {
                            System.out.println(deque.pollLast());
                            break;
                        }
                    case "size":
                        System.out.println(deque.size());
                        break;
                    case "empty":
                        if (deque.isEmpty()) {
                            System.out.println("1");
                            break;
                        } else {
                            System.out.println("0");
                            break;
                        }
                    case "front":
                        if (deque.isEmpty()) {
                            System.out.println("-1");
                            break;
                        } else {
                            System.out.println(deque.getFirst());
                            break;
                        }
                    case "back":
                        if (deque.isEmpty()) {
                            System.out.println("-1");
                            break;
                        } else {
                            System.out.println(deque.getLast());
                            break;
                        }
                    default:
                        System.out.println("-1");
                        break;
                } // switch
            } // while
        } // for(i)
        br.close();
    } // main

}

