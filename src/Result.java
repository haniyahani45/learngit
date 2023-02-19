import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        a = sc.nextInt();
        if(a>=80 && a<100)
        {
            System.out.print("Grade point is: 3.7 and Grade is A-");
        }
        else if(a>=75 && a<79)
        {
            System.out.print("Grade point is: 3.3 and Grade is B+");
        }
        else if(a>=70 && a<74)
        {
            System.out.print("Grade point is: 3 and Grade is B-");
        }
        else if(a>=65 && a<69)
        {
            System.out.print("Grade point is: 2.7 and Grade is C");
        }
        else if(a>=61 && a<64)
        {
            System.out.print("Grade point is: 2.3 and Grade is C+");
        }
        else if(a>=58 && a<60)
        {
            System.out.print("Grade point is: 2 and Grade is C");
        }
        else if(a>=55 && a<57)
        {
            System.out.print("Grade point is: 1.7 and Grade is C-");
        }
        else if(a>=50 && a<54)
        {
            System.out.print("Grade point is: 1 and Grade is D");
        }
        else
        {
            System.out.print("Grade point is: 0 and Grade is F");
        }
    }
}

