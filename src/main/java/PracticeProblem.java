public class PracticeProblem {

	public static void main(String args[]) {
		insertionSort(new char[] {'b', 'f', 'a', 'c', 'g', 'd', 'e', '0', ' '});
	}

	// public static void print(char[] args) {
	// 	for (int i = 0; i < args.length; i++) {
	// 		System.out.print("\"" + args[i] + "\" ");
	// 	}
	// 	System.out.println();
	// }

	public static void insertionSort(char[] characters) {
		
		// print(characters);

		for (int i = 0; i < characters.length; i++) {
			
			char swapThisValue = characters[i];
			// don't compare yourself
			int comparisonIndex = i - 1;

			while (comparisonIndex >= 0 && swapThisValue < characters[comparisonIndex]) {

				characters[comparisonIndex + 1] = characters[comparisonIndex];
				
				
				comparisonIndex --;
			}
			characters[comparisonIndex + 1] = swapThisValue;
			// print(characters);
		}
	}

}

/*
  ## Questions
1. Create a method called insertionSort(char[] characters) that accepts and array of characters and sorts it using the insertion sort algorithm. Do not return anything.
*/