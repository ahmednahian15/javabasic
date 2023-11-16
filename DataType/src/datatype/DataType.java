
package datatype;


public class DataType {

    
    public static void main(String[] args) {
        
        boolean b = true; //dynamic initialization
        char c = 'a';
        short s = 5045;
        int i = 511522;
        float f = 10.50f;
        double d = 10.5;
        
  
        System.out.println(" boolean b = " +b);
        System.out.println("c = "+c);
        System.out.println("short s = "+s);
        System.out.println("i = "+i);
        System.out.println("float f = "+f);
        System.out.println("d = "+d);
        
        
        
        System.out.printf("boolean b = %b\n",b);
        System.out.printf("char c = %c\n",c);
        System.out.printf("short s = %d\n",s);
        System.out.printf("integer i = %d\n",i);
        System.out.printf("float f = %.2f\n",f);
        System.out.printf("double d = %.1f\n",d);
    }
    
}
