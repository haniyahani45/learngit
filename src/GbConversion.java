import java.util.Scanner;

public class GbConversion {
    public static void main(String[] args){
        Double gb,mb,kb,bitt,byyte;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter GB");
        gb=s.nextDouble();
        mb= gb*1000;
        System.out.println(mb+"GB in mb");
        kb=mb*1000;
        System.out.println(kb+ "GB in kb");
        byyte = (double) (kb*1000);
        System.out.println(byyte+" GB in bytes");
        bitt = byyte*8;
        System.out.println(bitt+" GB in bits");
    }
}
