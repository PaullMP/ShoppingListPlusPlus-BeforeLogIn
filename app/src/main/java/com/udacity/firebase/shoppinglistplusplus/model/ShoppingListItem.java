package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * Created by Paul on 3/28/2016.
 */
public class ShoppingListItem {

    private String itemName;
    private String owner;

    public ShoppingListItem() {
    }

    public ShoppingListItem(String itemName) {
        this.itemName = itemName;
        this.owner = "Anonymous Owner";
    }

    public String getItemName() {
        return itemName;
    }

    public String getOwner() {
        return owner;
    }
}
