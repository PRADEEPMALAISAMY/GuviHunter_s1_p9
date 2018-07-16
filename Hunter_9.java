import java.util.Scanner;

public class Hunter_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ak = sc.nextInt();
		int arr[] = new int[ak];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
              for(int i=0;i<arr.length;i++) {
            	for(int j=i+1;j<arr.length;j++) {
         		            		if((arr[i]+arr[j])==0) {
                    			System.out.println(arr[i]+" "+arr[j]);
            			
            		}
            		
            	}
              }
	}
}
