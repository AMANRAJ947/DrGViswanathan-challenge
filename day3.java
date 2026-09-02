import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets
        // bucket[i] = elements having frequency i
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : map.keySet()) {
            int freq = map.get(num);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        // Step 3: Collect top k frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int freq = nums.length; freq >= 1 && index < k; freq--) {

            if (bucket[freq] != null) {
                for (int num : bucket[freq]) {
                    result[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}