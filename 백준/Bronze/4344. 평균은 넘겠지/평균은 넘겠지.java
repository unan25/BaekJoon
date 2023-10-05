import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); // 학생 수
            int[] scores = new int[N]; // 점수 배열

            // 입력된 점수 배열에 저장
            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
            }

            double sum = 0;

            // 모든 점수의 합 계산
            for (int score : scores) {
                sum += score;
            }

            double average = sum / N; // 평균 계산

            int countAboveAverage = 0;

            // 평균을 넘는 학생 수 세기
            for (int score : scores) {
                if (score > average) {
                    countAboveAverage++;
                }
            }

            double ratioAboveAverage = (double) countAboveAverage / N * 100.0;

            System.out.printf("%.3f%%\n", ratioAboveAverage);
        }
    }
}
