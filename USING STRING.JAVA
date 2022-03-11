import java.util.Scanner;
public class Main{
    public static void main( String[] args){
        int firstNo, secondNo,Product;
        System.out.println("Enter the value for the firstNo;");
        Scanner scan= new Scanner(System.in);
        firstNo= scan.nextInt();
        System.out.println("Enter the value for the secondNo;");
        secondNo= scan. nextInt();
        scan.close();
        
        Product= firstNo* secondNo;
        System.out.println("The result of the product id equal to; " + Product);
        
        String str= "";// declare an empty string
        while(Product!= 0){
            int rem= Product% 2;
            str= str+ rem;// store the reminders in the empty string
            Product= Product/2;
        }
        System.out.println(str);
        
    }
    
}
                     
        
   
