class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int boxes = 0;
        int units = 0;

        for (int i = 0; i < boxTypes.length; i++) {

            if (boxes + boxTypes[i][0] <= truckSize) {

                boxes += boxTypes[i][0];
                units += boxTypes[i][0] * boxTypes[i][1];

            } else {

                int remaining = truckSize - boxes;

                units += remaining * boxTypes[i][1];
                break;
            }
        }

        return units;
    }
}