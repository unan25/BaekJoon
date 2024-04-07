class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        for(int i = 0; i < s.length(); i++) {
            if(String.valueOf(s.charAt(i)).equals("p") || String.valueOf(s.charAt(i)).equals("P")) {
                p++;
            } else if(String.valueOf(s.charAt(i)).equals("y") || String.valueOf(s.charAt(i)).equals("Y")) {
                y++;
            }
        }
        if (p != y) {
            answer = false;
        }
        return answer;
    }
}