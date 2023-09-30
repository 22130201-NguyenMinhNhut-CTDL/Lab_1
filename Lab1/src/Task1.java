public class Task1 {
	private int[] array;

	public Task1(int[] array) {
		this.array = array;
	}

	public int sum() {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum;
	}

	public double average() {
		if (array.length == 0) {
			return 0.0; 
		}
		return (double) sum() / array.length;
	}

	public int findMax() {
		if (array.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int max = array[0];
		for (int num : array) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public int findMin() {
		if (array.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int min = array[0];
		for (int num : array) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

	public boolean contains(int target) {
		for (int num : array) {
			if (num == target) {
				return true;
			}
		}
		return false;
	}

	public void reverse() {
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}
	public int[] getArray() {
		return array;
	}
}
