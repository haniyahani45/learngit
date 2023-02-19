import java.util.Scanner;

public class TriangleArea {
    public static void main (String[] args){
        int height,breath;
        Double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height");
        height=sc.nextInt();
        System.out.println("Enter Breath");
        breath= sc.nextInt();
        area= (double) ((height*breath)/2);
        System.out.println(area+ " is a area of triangle");
    }
}
