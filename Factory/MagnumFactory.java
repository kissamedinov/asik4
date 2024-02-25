package Factory;

public class MagnumFactory implements Supermarket{
    @Override
    public Market createMarket(){
        return new Small();
    }
}
