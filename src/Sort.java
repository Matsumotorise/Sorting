public class Sort {
	protected static int[] testArr = new int[]{
			59, 23, 1, 5, 23, 1, 90
	};

	protected static void printArr(){
		System.out.print("[");
		for(Integer i : testArr)
			System.out.print(i + " ");
		System.out.print("]");
	}

	protected static void swap(int i, int j){
		int tmp= testArr[i];
		testArr[i] = testArr[j];
		testArr[j] = tmp;
	}

}
