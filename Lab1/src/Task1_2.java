import java.util.ArrayList;
import java.util.List;

public class Task1_2 {
    private int[] array;

    public Task1_2(int[] array) {
        this.array = array;
    }

    public int[] getMissingValues() {
        int minValue = array[0];
        int maxValue = array[array.length - 1];
        List<Integer> missingValues = new ArrayList<>();

        for (int i = minValue + 1; i < maxValue; i++) {
            boolean found = false;
            for (int num : array) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingValues.add(i);
            }
        }

        int[] resultArray = new int[missingValues.size()];
        for (int i = 0; i < missingValues.size(); i++) {
            resultArray[i] = missingValues.get(i);
        }

        return resultArray;
    }

    public int[] fillMissingValues(int k) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
            if (i < array.length - 1) {
                int current = array[i];
                int next = array[i + 1];
                int diff = next - current;
                if (diff > k) {
                    for (int j = 1; j < diff; j++) {
                        result.add(current + j);
                    }
                }
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
