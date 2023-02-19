import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        a=sc.nextInt();
                if(a%4==0)
                    System.out.println(a+" is a leap year");
                else
                    System.out.println(a+" is not leap year");
    }
}
