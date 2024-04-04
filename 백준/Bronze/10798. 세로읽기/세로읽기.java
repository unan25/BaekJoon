import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[][] arr = new String[5][15];
        
        for (int x = 0; x < 5; x++) {
            String str = br.readLine();
            for (int y = 0; y < str.length(); y++) {
                arr[x][y] = String.valueOf(str.charAt(y));
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != null) {
                    sb.append(arr[j][i]);
                }
            }
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    } // main()
} // Main()