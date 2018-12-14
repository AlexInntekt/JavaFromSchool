package com.company;


public class Product implements java.io.Serializable
{
    public String product;
    public double price;
    public int quantity;

    public Product(String setProduct, double setPrice, int quant)
    {
        this.price=setPrice;
        this.product=setProduct;
        this.quantity=quant;
    }


    public Product(String setProduct, double setPrice)
    {
        this.price=setPrice;
        this.product=setProduct;
        this.quantity=0;
    }

    public Product()
    {

    }




}