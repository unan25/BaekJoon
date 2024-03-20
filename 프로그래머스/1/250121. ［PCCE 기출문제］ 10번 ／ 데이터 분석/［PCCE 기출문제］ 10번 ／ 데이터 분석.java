import java.io.*;
import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();

        int[] arr = new int[data.length];
        int n = 0;


        for (int i = 0; i < data.length; i++) {
            int code = data[i][0];
            int date = data[i][1];
            int maximum = data[i][2];
            int remain = data[i][3];

            switch (ext) {
                case "code" :
                    if (code <= val_ext) {
                        answer.add(data[i]);
                    }
                    break;
                case "date" :
                    if (date <= val_ext) {
                        answer.add(data[i]);
                    }
                    break;
                case "maximum" :
                    if (maximum <= val_ext) {
                        answer.add(data[i]);
                    }
                    break;
                case "remain" :
                    if (remain <= val_ext) {
                        answer.add(data[i]);
                    }
                    break;
            }
        } // for(i)

        switch (sort_by) {
            case "code" : {
                answer.sort((o1, o2) -> {
                    return o1[0] - o2[0];
                });
                break;
            }
            case "date" : {
                answer.sort((o1, o2) -> {
                    return o1[1] - o2[1];
                });
                break;
            }
            case "maximum" : {
                answer.sort((o1, o2) -> {
                    return o1[2] - o2[2];
                });
                break;
            }
            case "remain" : {
                answer.sort((o1, o2) -> {
                    return o1[3] - o2[3];
                });
                break;
            }
        }

        return answer;
    }
}