import java.util.Scanner;

public class MaxNum {
    public static void main (String[] args){
        int a , b , c, temp , max;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        a= sc.nextInt();
        System.out.println("enter 2nd number");
        b= sc.nextInt();
        System.out.println("enter 3rd number");
        c= sc.nextInt();
        temp = a>b?a:b;
        max = temp>c?temp:c;
        System.out.println(max+" is  a maximum number");

    }
}
