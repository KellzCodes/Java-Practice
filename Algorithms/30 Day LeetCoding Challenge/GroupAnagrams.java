import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strings);
        System.out.println("List: " + result);
    }
    public static List<List<String>> groupAnagrams(String[] strings) {
        List<List<String>> result = new ArrayList<>();
        if (strings == null || strings.length == 0) return result;
        Map<Integer, Integer> map = new HashMap<>();
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19,
                23, 29, 31, 37, 41, 43, 47, 53,
                59, 61, 67, 71, 73, 79, 83, 89,
                97, 101};
        for (String str : strings) {
            int p = 1;
            for (char c : str.toCharArray()) {
                p *= primes[c - 'a'];
            }
            List<String> list;
            if (map.containsKey(p)) {
                list = result.get(map.get(p));
            } else {
                list = new ArrayList<>();
                result.add(list);
                map.put(p, result.size() - 1);
            }
            list.add(str);
        }
        return result;
    }
}
