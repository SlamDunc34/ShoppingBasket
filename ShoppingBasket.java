package ShoppingBasket;
import ShoppingBasket.*;

import java.util.*;


public class ShoppingBasket {

    private ArrayList<Product> basket;

    public ShoppingBasket(){
        this.basket = new ArrayList<Product>();
    }

    public void addItem(Product product){
        basket.add(product);
    }

    public void deleteItem(Product product){
        basket.remove(product);
    }

    public void emptyBasket(){
        this.basket = new ArrayList<Product>();
    }

    public int getTotalPrice() {
            int totalPrice = 0;
            for (Product product : basket) {
                totalPrice += price.productPrice();
            }
            return totalPrice;
        }

}