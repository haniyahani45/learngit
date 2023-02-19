import java.util.Scanner;

public class Areaofcircle {
    public static void main(String [] args){
        int r;
        Double a, pi= 3.14;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter radius");
        r = sc.nextInt();
        a = pi*r*r;
        System.out.println(a+" is a radius of circle");
    }

}
