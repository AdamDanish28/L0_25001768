
package w04l;

import java.util.Scanner;

public class W04L01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two integer number : ");
       int num1 = input.nextInt();
       int num2 = input.nextInt();
        System.out.println("Enter the operand: ");
       char letter = input.next().charAt(0);
       input.close();
       
       if (letter == '+'){
           System.out.println(num1 + " + " + num2+ " = "+ (num1+num2));
           
       } else if (letter == '-'){
           System.out.println(num1 + " - " + num2+ " =  "+ (num1-num2));
           
       } else if (letter == '*'){
           System.out.println(num1 + " * " + num2+ " =  " + (num1*num2));
           
       } else if (letter == '/'){
           System.out.println(num1 + " / " + num2+ " = "+ (num1/num2));
    } else if (letter == '%'){
            System.out.println(num1 + " % " + num2+ " = " + (num1%num2));
}
}
}
