import java.util.*;

public class Task1_1 {
    private int[] array;

    public Task1_1(int[] array) {
        this.array = array;
    }

    public int[] mirror() {
        int[] mirroredArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            mirroredArray[i] = array[i];
            mirroredArray[mirroredArray.length - 1 - i] = array[i];
        }
        return mirroredArray;
    }

    public int[] removeDuplicates() {
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        
        for (int element : array) {
            if (!uniqueElements.contains(element)) {
                resultList.add(element);
                uniqueElements.add(element);
            }
        }
        
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        
        return resultArray;
    }
}
