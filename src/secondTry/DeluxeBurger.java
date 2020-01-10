package secondTry;

public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe", "Beef & Chicken", 8.45, "Dark");
        super.addBurgerAddition1("Chips", 3.42);
        super.addBurgerAddition2("Drink", 1.45);
    }

    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }

    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }

    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }

    @Override
    public void addBurgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }
    

    
}