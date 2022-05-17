public class MaiorIntNaArray {
	public static int maiorDaIntArray(int[] intArray) {
		int maiorNum = -2147483648;
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] > maiorNum) {
				maiorNum = intArray[i];
			}
		}
		return maiorNum;
	}

	public static void main(String[] args) {
		int[] intArray = {334, 568, 123, 796, 225};
		System.out.println(maiorDaIntArray(intArray));
	}
}