package secondTry;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("Standard", "Beef", 2.55, "Dark");
        // double price = burger.itemizeBurger();
        burger.addBurgerAddition1("Tomato", 0.31);
        burger.addBurgerAddition2("Lettuce", 0.52);
        burger.addBurgerAddition3("Onion", 0.23);
        burger.addBurgerAddition4("Carrot", 0.44);

        System.out.println("Total burger price is = " + burger.itemizeBurger()); 

        System.out.println("------------");
        
        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 5.45);
        healthyBurger.addBurgerAddition1("Avocado", 0.75);
        healthyBurger.addHealthyAddition1("Tofu", 1.01);
        System.out.println("Total Healthy Burger price is " +  healthyBurger.itemizeBurger());

        System.out.println("------------");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addBurgerAddition1("dont", 4.72);
        // deluxeBurger.itemizeBurger();

    }

}