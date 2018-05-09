public class SelectionSort extends Sort {
	public SelectionSort() {

	}

	public void selectionSort() {
		int minI, minV, i, j;
		for (i = 0; i < testArr.length; i++) {
			minV = testArr[i];
			minI = i;
			for (j = i; j < testArr.length; j++) {
				if (minV > testArr[j]) {
					minV = testArr[j];
					minI = j;
				}
			}

			if (minV < testArr[i]) {
				swap(i, minI);
			}

		}
	}


}

