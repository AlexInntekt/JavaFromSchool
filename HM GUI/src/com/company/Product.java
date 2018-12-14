package com.company;


public class Product implements java.io.Serializable
{
    public String product;
    public double price;

    public Product(String setProduct, double setPrice)
    {
        this.price=setPrice;
        this.product=setProduct;
    }




}