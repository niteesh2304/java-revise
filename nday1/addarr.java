//copy an array

public class addarr{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};
		int [] arr1 = new int[arr.length];
			
		for(int i = 0;i<arr.length;i++){
			arr1[i] = arr[i];
			
			}
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr1[i]+ " ");
			}
		}	
	}