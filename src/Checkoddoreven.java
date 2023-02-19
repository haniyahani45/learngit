import java.util.Scanner;

public class Checkoddoreven {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        a = sc.nextInt();
        if (a % 4 == 0)
            System.out.println(a + "  is even");
        if (a % 4 != 0)
            System.out.println(a + "  is odd");
    }
}