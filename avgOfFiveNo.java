import java.util.Scanner;
public class avgOfFiveNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e,s;
        System.out.print("Enter five number: ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        s = (a+b+c+d+e)/5;

        System.out.println("Avarge: "+s);
    }
}
