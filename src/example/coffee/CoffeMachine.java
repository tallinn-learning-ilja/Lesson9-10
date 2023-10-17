package example.coffee;

import java.util.Scanner;

public class CoffeMachine {

    private BrewingStrategy brewingStrategy;

    public void selectBrewingStrategy(BrewingStrategy brewingStrategy) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Press 1 for basic coffee");
//        System.out.println("Press 2 for regular coffee");
//        System.out.println("Press 3 for premium coffee");
//        int choice = scanner.nextInt();
//        if (choice < 0 || choice > 3) {
//            System.out.println("Invalid input");
//        }
//        if (choice == 1) {
//            this.brewingStrategy = new BasicBrewingStrategy();
//        } else if (choice == 2) {
//            this.brewingStrategy = new RegularBrewingStrategy();
//        } else {
//            this.brewingStrategy = new PremiumBrewingStrategy();
//        }
        this.brewingStrategy = brewingStrategy;
    }

    public void brewCoffe() {
        if (brewingStrategy == null) {
            System.out.println("Can't brew coffee, please select which coffee you want");
            return;
        }
        brewingStrategy.brew();
    }
}
