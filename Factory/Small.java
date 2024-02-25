package Factory;

public class Small implements Market{
    @Override
    public void trade(){
        System.out.println("Small market");
    }
}
