import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public Long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			list.add(String.valueOf(str.charAt(i)));
		}
		Collections.sort(list);
		Collections.reverse(list);
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
        String s = "";
		s = String.valueOf(sb);
		answer = Long.parseLong(s);
        return answer;
    }
}