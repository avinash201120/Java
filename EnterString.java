import java.util.Scanner;
public class EnterString {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String a;
        System.out.println("Enter your name:");
        a=s.nextLine();
        System.out.println("Your name is "+a);
    }
}
