/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.item;

/**
 *
 * @author urosv
 */
public class Item {
    
    private String upcCode;
    private int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }
    public int getPrice() {
        return price;
    }
    
    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}
