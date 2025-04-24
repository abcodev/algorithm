import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(s1));
        return (int) Arrays.stream(s2)
                .filter(set1::contains)
                .count();
    }
}