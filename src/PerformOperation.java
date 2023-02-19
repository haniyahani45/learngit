import java.util.Scanner;

public class PerformOperation {
    public static void main(String[] args)
    {
        Double n1,n2,result;
        int operator;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1");
        n1=s.nextDouble();
        System.out.println("Enter number 2");
        n2=s.nextDouble();
        System.out.println("Enter operator");
        operator=s.nextInt();
        if (operator == '*')
        {
            result = n1*n2;
            System.out.println(result+" is a result");
        }
        else if (operator == '/')
        {
            result = n1/n2;
            System.out.println(result+" is a result");
        }
        else if (operator == '-'){
            result=n1-n2;
        System.out.println(result+" is a result");
    }
        else if (operator == '+') {
            result=n1+n2;
        System.out.println(result+" is a result");

    }
        else {
        System.out.println("invalid operator");
    }
    }
}
