import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        int a, b, c, temp, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        a = sc.nextInt();
        System.out.println("enter 2nd number");
        b = sc.nextInt();
        System.out.println("enter 3rd number");
        c = sc.nextInt();
        temp = a < b ? a : b;
        min = temp < c ? temp : c;
        System.out.println(min + " is  a minimum number");

    }
}