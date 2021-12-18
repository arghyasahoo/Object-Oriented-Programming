package com.oopslab.assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class ItemManager {
    ArrayList<Item> items = new ArrayList<>();
    HashSet<Integer> itemCodes = new HashSet<>();

    public void add(Item item) {
        if (itemCodes.contains(item.getItemCode())) {
            item.setItemCode(item.getItemCode() + 1);
        } else {
            itemCodes.add(item.getItemCode());
            items.add(item);
        }
    }

    public void issue(String itemName) {
        Item item = findItem(itemName);
        if (item != null) {
            if (item.getQuantity() > 0) {
                item.setQuantity(item.getQuantity() - 1);
                items.remove(item);
            } else {
                System.out.println("[-] Item out of stock");
            }
        } else {
            System.out.println("[-] Item not Found");
        }
    }

    public ArrayList<Item> costMore(double amount) {
        ArrayList<Item> costlyItems = new ArrayList<>();

        for (Item item : items) {
            if (item.getRate() > amount) {
                costlyItems.add(item);
            }
        }

        return costlyItems;
    }

    private Item findItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName))
                return item;
        }
        return null;
    }
}
