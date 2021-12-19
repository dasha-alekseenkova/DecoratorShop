public class MatchingShoes extends Decorator{
    public MatchingShoes(Clothes newClothes) {
        super(newClothes);
    }
    public String AddToCart(){
        return super.AddToCart() +" with silver high heels ";
    }
    public double price()   {
        return super.price()+900.25;
    }

}