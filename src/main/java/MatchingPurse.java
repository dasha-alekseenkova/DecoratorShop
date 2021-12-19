public class MatchingPurse extends Decorator{
    public MatchingPurse(Clothes newClothes) {
        super(newClothes);
    }
    public String AddToCart(){
        return super.AddToCart() +" with white glamorous purse ";
    }
    public double price()   {
        return super.price()+795.50;
    }

}
