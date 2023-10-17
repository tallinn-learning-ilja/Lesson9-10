package example.coffee;

public class BasicBrewingStrategy implements BrewingStrategy{
    @Override
    public void brew() {
        System.out.println("Brewing basic coffee");
    }
}
