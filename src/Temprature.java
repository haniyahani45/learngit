import java.util.Scanner;

public class Temprature {
    public static void main (String[] args){
        Double f,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature in farenhite");
        f=sc.nextDouble();
        c=5/9*(f-32);
        System.out.println("Temprature in celcius is: " +c);
    }
}
