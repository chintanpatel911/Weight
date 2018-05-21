
/*
 * Name : Chintan Patel
 * CSU ID : 2473177
 * Assigment 6 : Calculate weight for grade 
 */
public class Weight{
	public static void main (String[] args) {
		int [] value = {98, 99, 98, 100, 101, 102, 100, 104, 105, 105, 106, 105, 103, 104, 103, 105, 105, 106, 107, 106, 105, 105, 105, 104, 103, 102, 102, 101, 100, 102};
		
		printWeightAvg(value); 
	}

	public static void printWeightAvg(int[] value) {
		int i = 0;
		double sum = 0;
		
		for (i = 0 ; i < value.length ; i++){
			sum += value [i];
		}
		double averge = sum / value.length;
		System.out.println("The averge" + ":" + averge);
	}
}