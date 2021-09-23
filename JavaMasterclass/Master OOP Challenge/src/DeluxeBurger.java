public class DeluxeBurger extends Burger{

    private Drink drink;
    private Chips chips;

    public DeluxeBurger(String breadRollType, String typeOfMeat, double price,  Drink drink, Chips chips) {
        super(breadRollType, typeOfMeat, price, new FirstAdd(0,false), new seceondAdd(0,false), new thirdAdd(0,false), new FourthAdd(0, false));
        this.drink = drink;
        this.chips = chips;

    }

    @Override
    public double TotalPrice() {
        System.out.println("Deluxe burger set");
        System.out.println("Chips and drink - price included in price of set");

        double totalPrice = super.TotalPrice();
        return totalPrice;


        }
}
