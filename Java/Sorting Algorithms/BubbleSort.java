import java.util.Scanner;

class BubbleSort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n-i-1; j++){
				if(arr[j] > arr[j+1]){
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
		for(int a : arr)
			System.out.print(a + " ");
	}
}