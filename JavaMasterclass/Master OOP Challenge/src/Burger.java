import java.sql.SQLOutput;

public class Burger {

    private String breadRollType;
    private String typeOfMeat;
    private double price;
    private FirstAdd firstAdd;
    private seceondAdd seceondAdd;
    private thirdAdd thirdAdd;
    private FourthAdd fourthAdd;

    public Burger(String breadRollType, String typeOfMeat, double price, FirstAdd firstAdd, seceondAdd seceondAdd, thirdAdd thirdAdd, FourthAdd fourthAdd) {
        this.breadRollType = breadRollType;
        this.typeOfMeat = typeOfMeat;
        this.price = price;
        this.firstAdd = firstAdd;
        this.seceondAdd = seceondAdd;
        this.thirdAdd = thirdAdd;
        this.fourthAdd = fourthAdd;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public double getPrice() {
        return price;
    }

    public double TotalPrice(){
        double totalPrice = price;

        System.out.println("Burger - "+price);

        if(firstAdd.isChosen()){
            System.out.println("FirstAdd - " +firstAdd.getPrice());
            totalPrice += firstAdd.getPrice();
        }
        if(seceondAdd.isChosen()){
            System.out.println("SecondAdd - " +seceondAdd.getPrice());
            totalPrice += seceondAdd.getPrice();
        }
        if(thirdAdd.isChosen()){
            System.out.println("Third Add - " +thirdAdd.getPrice());
            totalPrice += thirdAdd.getPrice();
        }
        if(fourthAdd.isChosen()){
            System.out.println("Fourth Add - " +fourthAdd.getPrice());
            totalPrice += fourthAdd.getPrice();
        }

        return totalPrice;

    }

}
