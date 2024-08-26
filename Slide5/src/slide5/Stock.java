/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import java.io.Serializable;

/**
 *
 * @author buimi
 */
public class Stock implements Serializable{
    private int id;
    private String desc;
    private double price;
    private int quantity;

    public Stock(int id, String desc, double price, int quantity) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return(id+" - "+ desc +" - "+price+" - "+quantity);
    }
}
