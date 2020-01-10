package secondTry;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("Standard", "Beef", 2.55, "Dark");
        // double price = burger.itemizeBurger();
        burger.addHamburgerAddition1("Tomato", 0.31);
        burger.addHamburgerAddition2("Lettuce", 0.52);
        burger.addHamburgerAddition3("Onion", 0.23);
        burger.addHamburgerAddition4("Carrot", 0.44);

        System.out.println("Total burger price is = " + burger.itemizeBurger()); 
    }
}