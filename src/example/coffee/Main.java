package example.coffee;

public class Main {

    public static void main(String[] args) {
        CoffeMachine coffeMachine = new CoffeMachine();
        coffeMachine.brewCoffe();

        coffeMachine.selectBrewingStrategy(new PremiumBrewingStrategy());
        coffeMachine.brewCoffe();
        coffeMachine.selectBrewingStrategy(new BasicBrewingStrategy());
        coffeMachine.brewCoffe();
    }
}
