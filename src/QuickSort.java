import java.util.Arrays;

public class QuickSort extends Sort {

	public void quickSort(){
		quickSort(testArr, 0, testArr.length -1);
	}
	private void quickSort(int[] testArr, int low, int high){
		if(low < high + 1){
			int p = partition(testArr, low, high);
			quickSort(testArr, low, p - 1);
			quickSort(testArr, p+1, high);
		}
	}

	private int getPivot(int low, int high){
		return (int) Math.random() * (high - low + 1)  + low;
	}

	private int partition(int[] testArr, int low, int high){
		swap(low, getPivot(low, high));
		int border = low +1;
		for(int i = 0; i < testArr.length; i++){
			if(testArr[i] < testArr[low]){
				swap(i, border++);
			}
		}
		swap(low, border -1);
		return border-1;
	}
}
