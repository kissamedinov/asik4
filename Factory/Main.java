package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String market = sc.next();
        Supermarket supermarket = marketdefiner(market);
        Market markett = supermarket.createMarket();
        markett.trade();
    }
    public static Supermarket marketdefiner(String definer){
        if(definer.equalsIgnoreCase("Small market")){
            return new SmallFactory();
        } else if(definer.equalsIgnoreCase("Magnum market")){
            return new MagnumFactory();
        } else{
            System.out.println("There is no such market");
        }
        return null;
    }
}
