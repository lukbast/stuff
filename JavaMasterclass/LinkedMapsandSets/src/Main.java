public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {

        StockItem temp = new StockItem("bread",0.86,100 );
        stockList.addStock(temp);

        temp= new StockItem("cake",1.10,7 );
        stockList.addStock(temp);

        temp= new StockItem("car",12.50,2 );
        stockList.addStock(temp);

        temp= new StockItem("chair",62.0,10 );
        stockList.addStock(temp);

        temp= new StockItem("cup",0.50,200 );
        stockList.addStock(temp);
        temp= new StockItem("cup",0.50,7 );
        stockList.addStock(temp);

        temp= new StockItem("door",72.95,4 );
        stockList.addStock(temp);

        temp= new StockItem("juice",2.50,36 );
        stockList.addStock(temp);

        temp= new StockItem("phone",96.99,35 );
        stockList.addStock(temp);

        temp= new StockItem("towel",2.40,80 );
        stockList.addStock(temp);

        temp= new StockItem("vase",8.76,40 );
        stockList.addStock(temp);




        Basket customer1 = new Basket("Customer #1");

        addToBasket(customer1,"vase", 1);
        addToBasket(customer1,"towel", 2);
        addToBasket(customer1,"car", 2);
        addToBasket(customer1,"phone", 4);
        addToBasket(customer1,"cup", 5);
        System.out.println(customer1.toString());

        System.out.println("============================");

        checkout(customer1);















    }//end of main method

    public static int addToBasket(Basket basket, String itemName, int quantity){
        // retrieve item form stock list

        StockItem stockItem = stockList.get(itemName);
        if(stockItem==null){
            System.out.println("We don't sell "+ itemName);
            return 0;
        }
          if(stockItem.getStock()>=(stockItem.getReservedStock()+quantity)){
              basket.addToBasket(stockItem,quantity);
              return quantity;
          }  else System.out.println("Can't reserve more than in stock.");
          return 0;
        }

        public static void checkout(Basket basket){
            System.out.println(basket.toString());
        basket.checkoutBasket();
            System.out.println(stockList.toString());
        }

        public static void removal(Basket basket, String name, int quantity){
        if(stockList.items().containsKey(name)){
        StockItem item = stockList.get(name);
        basket.removeFromBasket(item,quantity);
        }

        }





}//end of main class
