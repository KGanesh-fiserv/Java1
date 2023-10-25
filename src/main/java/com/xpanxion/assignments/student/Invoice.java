package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Invoice extends Base{
    //private int id;
    private ArrayList<Product> prod = new ArrayList<Product>();

    public Invoice(int id) {
        setId(id);
        //this.id = id;
    }

    /*public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public void addProduct(Product a){
        prod.add(a);
    }

    public double getTotalCost(){
        double x = 0;
        for(Product a : prod){
            x += a.getCost();
        }
        return x;
    }
    
}
