package example.coffee;

public class PremiumBrewingStrategy implements BrewingStrategy{
    @Override
    public void brew() {
        System.out.println("Brewing premium coffee");
    }
}
