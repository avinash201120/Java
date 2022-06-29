import java.util.Scanner;
public class array_input {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        int total = 0;

        for(int i=0; i<arr.length; i++){
        	
        	arr[i] = scanner.nextInt();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
    }
}
