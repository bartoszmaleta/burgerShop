package firstTry;

public class App {
    public static void main(String[] args) throws Exception {
        Burger burger = new Burger("Hamburger", 2, "Dark", "Beef", 1, 0, 1, 0);

        System.out.println(burger.getPrice());

    }
}