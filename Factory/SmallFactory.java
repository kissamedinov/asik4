package Factory;

public class SmallFactory implements Supermarket{
    @Override
    public Factory.Market createMarket(){
        return new Small();
    }
}
