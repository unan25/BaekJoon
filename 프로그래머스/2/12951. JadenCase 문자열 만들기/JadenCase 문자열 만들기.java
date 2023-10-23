import java.util.StringTokenizer;

    class Solution {
        public String solution(String s) {
            String answer = "";
            s = s.toLowerCase();
            StringTokenizer st = new StringTokenizer(s, " ", true);
            StringBuilder sb = new StringBuilder();

            while (st.hasMoreTokens()){
                String word = st.nextToken();
                sb.append(word.substring(0,1).toUpperCase()).append(word.substring(1));
            }
            answer = sb.toString();
            return answer;
        }
    }