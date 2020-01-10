package firstTry;

public class HealthyBurger extends Burger {
    private int avocado;
    private int tofu;

    public HealthyBurger(String name, double basePrice, String breadRollType, String meat, int lettuce, int tomato,
            int carrot, int onion, int avocado, int tofu) {
        super(name, basePrice, "brown rye bread roll", meat, lettuce, tomato, carrot, onion);
        this.avocado = avocado;
        this.tofu = tofu;

    }

    // @Override
    // public double getPrice() {
    //     if (getLettuce() > 0) {
    //         super.basePrice = (this.basePrice + 0.2) * this.lettuce;
    //     }
    //     if (this.tomato > 0) {
    //         this.basePrice = (this.basePrice + 0.3) * this.tomato;
    //     }
    //     if (this.carrot > 0) {
    //         this.basePrice = (this.basePrice + 0.4) * this.carrot;
    //     }
    //     if (this.onion > 0) {
    //         this.basePrice = (this.basePrice + 0.5) * this.onion;
    //     }
    //     return this.basePrice;
    // }

    public int getAvocado() {
        return avocado;
    }

    public void setAvocado(int avocado) {
        this.avocado = avocado;
    }

    public int getTofu() {
        return tofu;
    }

    public void setTofu(int tofu) {
        this.tofu = tofu;
    }

}