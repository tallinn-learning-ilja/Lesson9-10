package example.coffee;

public class RegularBrewingStrategy implements BrewingStrategy{
    @Override
    public void brew() {
        System.out.println("Brewing regular coffee");
    }
}
