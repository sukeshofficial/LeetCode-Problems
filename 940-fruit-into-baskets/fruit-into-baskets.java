class Solution {
    public int totalFruit(int[] fruits) {
        // HashSet<Integer> uniqueType = new HashSet<>();
        // HashMap<Integer, Integer> freq = new HashMap<>();

        // for (int ftype : fruits) {
        //     uniqueType.add(ftype);
        // }

        // for (int ftype : fruits) {
        //     freq.put(ftype, freq.getOrDefault(ftype, 0) + 1);
        // }

        // TreeSet<Integer> sortedValues = new TreeSet<>(freq.values());

        // int max = sortedValues.pollLast(); // 95 (removes and returns highest)
        // int secondMax = sortedValues.pollLast(); // 90 (removes and returns next highest)

        // // System.out.println(freq);

        // return max + secondMax;

        // [3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4]
        //  |           
        // max = 
        // fruits = [1,2,3,2,2]
        //             |     | 

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while(map.size() > 2) {
                int fruit = fruits[left];
                map.put(fruit, map.get(fruit) - 1);

                if(map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}