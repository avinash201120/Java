import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        int i,fact=1;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial:"+fact);

    }
    
}
