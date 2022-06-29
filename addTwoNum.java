import java.util.Scanner;
class addTwoNum{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enetr two number:");
        a = s.nextInt();
        b = s.nextInt();
        c=a+b;

        System.out.println("Sum:"+c);
    }
}