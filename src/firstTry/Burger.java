package firstTry;

public class Burger {
    private String name;
    private double basePrice;
    private String breadRollType;
    private String meat;
    private int lettuce;
    private int tomato;
    private int carrot;
    private int onion;

    public Burger(String name, double basePrice, String breadRollType, String meat, int lettuce, int tomato, int carrot,
            int onion) {
        this.name = name;
        this.basePrice = 2.0;
        this.breadRollType = breadRollType;
        this.meat = meat;
        if (lettuce > 0 && lettuce < 5) {
            this.lettuce = lettuce;
        } else {
            this.lettuce = 0;
        }
        if (tomato > 0 && tomato < 5) {
            this.tomato= tomato;
        } else {
            this.tomato = 0;
        }
        if (carrot > 0 && carrot < 5) {
            this.carrot = carrot;
        } else {
            this.carrot = 0;
        }
        if (onion > 0 && onion < 5) {
            this.onion = onion;
        } else {
            this.onion = 0;
        }
    }

    public double getPrice() {
        if (this.lettuce > 0) {
            this.basePrice = this.basePrice + 0.2;
        } 
        if (this.tomato > 0) {
            this.basePrice = this.basePrice + 0.3;
        } 
        if (this.carrot > 0) {
            this.basePrice = this.basePrice + 0.4;
        } 
        if (this.onion > 0) {
            this.basePrice = this.basePrice + 0.5;
        } 

        return this.basePrice;
    }
    
}