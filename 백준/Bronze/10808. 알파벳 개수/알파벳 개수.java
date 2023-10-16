import java.io.BufferedReader;
import java.io.InputStreamReader;

/*/
알파벳 26개
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr [] = new int[26]; // 길이 26의 배열

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); // char 변환

            for (int j = 0; j < 26; j++) {
                int count = 0;
                if ((ch - 0) == 97 + j){ // char 숫자 비교 및 배열 대입
                    count++;
                    arr[j] = arr[j] + count;
                }
            }
        }
        for (int k = 0; k < 26; k++){ // arr print
            System.out.print(arr[k] + " ");
        }

    }
}