import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final String name;
    private final Map<StockItem, Integer> basketContent;

    public Basket(String name) {
        this.name = name;
        this.basketContent = new TreeMap<>();
    }


    public void addToBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0) {
            int inBasket = basketContent.getOrDefault(item, 0);
            basketContent.put(item, inBasket + quantity);
            item.adjustReservedStock(inBasket+quantity);
        }
    }

    public void removeFromBasket(StockItem item, int quantity){
        if(item!=null && quantity>0 && basketContent.containsKey(item)){
            if(basketContent.get(item)-quantity<0){
                System.out.println("Can't remove from basket more than it contains");
            }
            if(basketContent.get(item)==quantity){
                item.adjustReservedStock(-quantity);
                basketContent.remove(item);
            } else {
                int newQuantity = basketContent.get(item)-quantity;
                basketContent.put(item,newQuantity);
                item.adjustReservedStock(-quantity);
            }
        }
    }

    public void checkoutBasket(){
        for(StockItem item: basketContent.keySet()){
            item.adjustStock(-basketContent.get(item));
            item.adjustReservedStock(-basketContent.get(item));
        }
        this.basketContent.clear();
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(basketContent);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nShopping basket " + name + " contains " + basketContent.size() + " items\n");
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> items : basketContent.entrySet()) {
            s.append(items.getKey()).append(": ").append(items.getValue()).append(" purchased\n");
            totalCost += items.getKey().getPrice() * items.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
