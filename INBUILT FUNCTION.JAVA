import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int firstNo, secondNo, Product;
        System.out.println("Enter the value for the FirstNo; ");
        Scanner scan= new Scanner(System.in);
        firstNo= scan.nextInt();
        System.out.println("Enter the value for the SecondNo; ");
        secondNo= scan.nextInt();
        scan.close();
        
        Product= firstNo * secondNo;
        System.out.println("The result of the product is equal to; "+ Product);
        
        String Binary= Integer.toBinaryString(Product);
        System.out.println("The binary number of the product is; "+ Binary);
        
    }
}
