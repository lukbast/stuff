import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem > stockList;

    public StockList(){
        this.stockList = new LinkedHashMap<>();
    }

    public void addStock(StockItem item){
        if(item!=null){
            // check if we already have quantities/on list
            StockItem inStock = stockList.getOrDefault(item.getName(),item);
            // if there are already stocked on this item, adjust the quantity
            if(inStock!=item){
                item.adjustStock(inStock.getStock());
            }
            stockList.put(item.getName(), item);
        }
    }

//    public int sellStock(String name, int quantity){
//        if(!stockList.containsKey(name) || quantity<0){
//            return -1;
//        }
//        StockItem item = stockList.get(name);
//        if(item.getStock()<quantity){
//            System.out.println("We have only " +item.getStock()+" pcs of "+item.getName() );
//            return -1;
//        }
//        item.adjustStock(-quantity);
//        return item.getStock();
//    }

    public StockItem get(String name){
        return stockList.get(name);
    }

    public Map<String, StockItem> items(){
        return Collections.unmodifiableMap(stockList);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nStock List\n");
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item: stockList.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.getStock();
            s.append(stockItem).append(" Value of items: ");
            s.append(String.format("%.2f", itemValue)).append("\n");
            totalCost+=itemValue;
        }
        return s + " Total stock value " + String.format("%.2f",totalCost);
    }
}

