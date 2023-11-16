
package beginnerjava;

import java.util.Scanner;


public class InputDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number;
        String name;
        double num1;
        
        System.out.print("Enter Your Name :");
        name =input.nextLine();
        System.out.println("Name ="+name);
        
        System.out.print("Enter double value :");
        num1 = input.nextDouble();
        System.out.println(num1);
        
        System.out.print("Enter any number : ");
        number = input.nextInt();
        System.out.println("number =" +number);
    }
    
}
