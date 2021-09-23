
public class StockItem implements Comparable<StockItem> {

    private final String name;
    private  double price;
    private int stock;
    private int reservedStock;


    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.stock = 0;
        this.reservedStock=0;
    }

    public StockItem(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getReservedStock(){
        return reservedStock;
    }



    public void setPrice(double price) {
        if(price>0){
        this.price = price;
        }
    }

    public void adjustReservedStock(int quantity){
        if((quantity+this.reservedStock)<=this.stock){
            this.reservedStock=this.reservedStock+quantity;
        }
    }

    public void adjustStock(int quantity){
        if((quantity+this.stock)>=0){
            this.stock=this.stock+quantity;
        }
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Running Stock.equals...");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockItem stockItem = (StockItem) o;
        return name.equals(stockItem.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+69;
    }

    @Override
    public int compareTo(StockItem o) {

        //System.out.println("Running StockItem.");
        if(this ==o){
            return 0;
        }
        if(o!=null)
        {
            return this.name.compareTo(((StockItem) o).getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return  name +": price -> " + price +
                "; stock -> " + stock;
    }
}
