public class HealtyhyBurger extends Burger{


    private FirstHealthyAdd firstHealthyAdd;
    private SecondHealthyAdd secondHealthyAdd;

    public HealtyhyBurger( String typeOfMeat, double price, FirstAdd firstAdd, seceondAdd seceondAdd, thirdAdd thirdAdd, FourthAdd fourthAdd, FirstHealthyAdd firstHealthyAdd, SecondHealthyAdd secondHealthyAdd) {
        super("brown rye", typeOfMeat, price, firstAdd, seceondAdd, thirdAdd, fourthAdd);
        this.firstHealthyAdd = firstHealthyAdd;
        this.secondHealthyAdd = secondHealthyAdd;
    }


    @Override
    public double TotalPrice() {
        System.out.println("Healthy burger");
        double totalPrice = super.TotalPrice();

        if (firstHealthyAdd.isChosen()){
            totalPrice+= firstHealthyAdd.getPrice();
            System.out.println("FirstHealthyAdd - "+firstHealthyAdd.getPrice());
        }
        if (secondHealthyAdd.isChosen()){
            totalPrice+= secondHealthyAdd.getPrice();
            System.out.println("FirstHealthyAdd - "+secondHealthyAdd.getPrice());
        }


        return totalPrice;



        }


}


