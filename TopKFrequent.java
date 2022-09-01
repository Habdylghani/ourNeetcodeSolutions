import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequent {
    class Number {
        int num;
        int freq;

        public Number(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }

    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Number> list = new ArrayList<>();
        for (int n : nums) {
            map.put(n, (map.getOrDefault(n, 0) + 1));
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            Number mynumber = new Number(entry.getKey(), entry.getValue());
            list.add(mynumber);
        }

        list.sort((n, m) -> m.freq - n.freq);
        int[] res = new int[k];
        int i = k;
        while (k > 0) {
            res[i - k] = list.get(i - k).num;
            k--;
        }
        return res;
    }

    public int[] topKFrequentHeap(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, (map.getOrDefault(num, 0) + 1));
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(map.get(a), map.get(b)));

        for (int key : map.keySet()) {
            pq.add(key);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[pq.size()];
        int i = 0;

        while (pq.size() > 0) {
            ans[i++] = pq.poll();
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 3, 3 };
        int k = 2;
        TopKFrequent t = new TopKFrequent();
        System.out.println(Arrays.toString(t.topKFrequent(nums, k)));
        System.out.println(Arrays.toString(t.topKFrequentHeap(nums, k)));

    }
}
