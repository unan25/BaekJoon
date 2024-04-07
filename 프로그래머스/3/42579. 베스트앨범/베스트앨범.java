import java.util.*;

class Solution {
    public List<Integer> solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();

        // 각 장르별 총 재생 횟수 계산
        Map<String, Integer> totalPlays = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            if (totalPlays.containsKey(key)) {
                int value = totalPlays.get(key);
                totalPlays.put(key, value + plays[i]);
            } else {
                totalPlays.put(genres[i], plays[i]);
            }
        }

        // 장르별 인덱스 저장
        Map<String, List<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (!indexMap.containsKey(genres[i])) {
                indexMap.put(genres[i], new ArrayList<>());
            }
            indexMap.get(genres[i]).add(i); // 해당 장르의 인덱스 추가
        }

        // 각 장르별 총 재생 횟수를 기준으로 내림차순 정렬 (= totalPlays 내림차순)
        List<String> sortGenres = new ArrayList<>(totalPlays.keySet());
        sortGenres.sort((g1, g2) -> Integer.compare(totalPlays.get(g2), totalPlays.get(g1)));

        for (String s : sortGenres) {
            List<Integer> list = indexMap.get(s); // 해당 장르의 장르별 indexMap의 value값인 인덱스 리스트 가져오기

            // plays를 기준으로 내림차순 정렬
            list.sort(((o1, o2) -> Integer.compare(plays[o2], plays[o1])));

            // 장르별로 노래를 최대 두 개까지 수록
            int count = 0;
            for (int n : list) {
                answer.add(n);
                count++;
                if (count >= 2) break;
            }
        }

        return answer;
    }
}