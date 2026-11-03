
package w04l;

import java.util.Random;

public class W04L02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomInt = rand.nextInt(6);
        
        switch(randomInt){
            case 0:
                System.out.println(randomInt + " is zero");
                break;
            case 1:
                System.out.println(randomInt + " is one");
                break;
            case 2:
                System.out.println(randomInt + " is two");
                break;
            case 3:
                System.out.println(randomInt + " is three");
                break;
            case 4:
                System.out.println(randomInt + " is four");
                break;
            case 5:
                System.out.println(randomInt + " is five");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
