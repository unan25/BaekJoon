import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String result = keyLogger(str);
            System.out.println(result);
        }

        br.close();
    }

    private static String keyLogger(String str) {
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (char c : str.toCharArray()) {
            switch (c) {
                case '<':
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case '>':
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case '-':
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                default:
                    leftStack.push(c);
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }
        
        return sb.toString();
    }

}