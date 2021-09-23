public class Main {


    public static void main(String[] args) {


        Burger burger = new Burger("bestOne","chicken",
                2,new FirstAdd(3,true),
                new seceondAdd(4,true),
                new thirdAdd(5,false),
                new FourthAdd(3,false));
        System.out.println("Total price - "+burger.TotalPrice());
        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger("NiceOne","Kuciak",10,new Drink(20),new Chips(69));
        System.out.println("Total price - " +deluxeBurger.TotalPrice());
        System.out.println();


        HealtyhyBurger healtyhyBurger =new HealtyhyBurger("Horse",69,
                new FirstAdd(20,true),
                new seceondAdd(10,false),
                new thirdAdd(1, false),
                new FourthAdd(23, false),
                new FirstHealthyAdd(23,true),
                new SecondHealthyAdd(45,false));
        System.out.println(healtyhyBurger.TotalPrice());

    }




}
