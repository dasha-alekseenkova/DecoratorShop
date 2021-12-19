public abstract class Decorator implements Clothes{
    private Clothes newClothes;
    public Decorator(Clothes newClothes)  {
        this.newClothes = newClothes;
    }
    @Override
    public String AddToCart(){
        return newClothes.AddToCart();
    }
    public double price(){
        return newClothes.price();
    }
}

