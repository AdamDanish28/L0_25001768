
package w04l;
import java.util.Scanner;

public class W04L03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your sales: ");
        double salesVolume = input.nextDouble();
        double commission;
        
        if (salesVolume<=100){
               commission = 0.05*salesVolume;
               System.out.printf("Your commission is %.2f%n" , commission  );
               
        } else if (salesVolume>100 && salesVolume<= 500 ){
               commission = 0.075*salesVolume;
               System.out.printf("Your commission is %.2f%n" , commission  );
               
        } else if (salesVolume>500 && salesVolume<=1000){
               commission = 0.1*salesVolume;
               System.out.printf("Your commission is %.2f%n" , commission  );
               
        } else {
               commission = 0.125*salesVolume;
               System.out.printf("Your commission is %.2f%n" , commission  );
        }
        input.close();
    }
}
