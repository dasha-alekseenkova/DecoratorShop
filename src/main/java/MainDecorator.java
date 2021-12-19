import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainDecorator {
    private static int  n;
    public static void main(String args[]) throws NumberFormatException, IOException    {
        do{
            System.out.println("Super cool Clothing store <Beauty Princess>");
            System.out.println("1.Dress");
            System.out.println("2.Purse");
            System.out.println("3.Shoes");
            System.out.println("4.Go home");
            System.out.println("Enter your choice: ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            n=Integer.parseInt(br.readLine());
            switch (n) {
                case 1:{
                    Dresses dress =new Dresses();
                    System.out.println(dress.AddToCart());
                    System.out.println(dress.price());
                }
                break;
                case 2:{
                    Clothes purse=new MatchingPurse((Clothes) new Dresses());
                    System.out.println(purse.AddToCart());
                    System.out.println(purse.price());
                }
                break;
                case 3:{
                    Clothes shoes=new MatchingShoes((Clothes) new Dresses());
                    System.out.println(shoes.AddToCart());
                    System.out.println(shoes.price());
                }
                break;
                default:{
                    System.out.println("Thanks for visiting our store! Bye! ");
                }
                return;
            }
        }while(n!=4);
    }
}
