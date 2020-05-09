/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.item.Item;
import model.shoppingcart.ShoppingCart;
import model.strategy.impl.CreditCartStrategy;
import model.strategy.impl.PayPalStrategy;

/**
 *
 * @author urosv
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("2134", 10));
        cart.addItem(new Item("25234", 20));
        cart.addItem(new Item("43214", 550));
        
        cart.pay(new PayPalStrategy("uros@gmail.com", "mojpassword"));
        cart.pay(new CreditCartStrategy("Uros Veljkovic", "1234568790", "444", "12/22"));

    }

}
