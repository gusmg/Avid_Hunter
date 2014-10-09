/*
 * The Item class stands for all items that will exist in the game. They each have
 * a different value when sold to the shop and a different price when you want to 
 * buy them from the shop (when available).
 * Another important attribute is their max stack size, or the maxQuantity attribute.
 * This is only valid for items in inventories like the player's personal inventory and
 * equipped items. Items in the equipment inventory are only allowed 1 of each (gloves 
 * and boots are considered one pair) and when the player has bought a particular tool from
 * the shop, they are no longer available. Bows are an equipment that you only need 1 of,
 * as well, so will also disappear from the shop once purchased, and reappear once sold
 * back to the shop (in case the player wants to revert to a cheaper bow).
 */
package byui.cit260.avid_hunter.model;

import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author C§
 */
public class Item implements Serializable {
    
    private int quantity, shopPrice, shopValue, weight, maxQuantity;
    private String type;

    public Item() {
        quantity = 0;
    }
    
    public Item(int qty, int spc, int svu, int wt, int mqty, String tp) {
        quantity = qty;
        shopPrice = spc;
        shopValue = svu;
        weight = wt;
        maxQuantity = mqty;
        type = tp;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(int shopPrice) {
        this.shopPrice = shopPrice;
    }

    public int getShopValue() {
        return shopValue;
    }

    public void setShopValue(int shopValue) {
        this.shopValue = shopValue;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" + "quantity=" + quantity + ", shopPrice=" + shopPrice + ", shopValue=" + shopValue + ", weight=" + weight + ", maxQuantity=" + maxQuantity + ", type=" + type + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.quantity;
        hash = 79 * hash + this.shopPrice;
        hash = 79 * hash + this.shopValue;
        hash = 79 * hash + this.weight;
        hash = 79 * hash + this.maxQuantity;
        hash = 79 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.shopPrice != other.shopPrice) {
            return false;
        }
        if (this.shopValue != other.shopValue) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        if (this.maxQuantity != other.maxQuantity) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    
}
