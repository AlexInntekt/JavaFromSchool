package com.company;
import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        LinkedList<Pizza> zonaDePizza = new LinkedList();
        Kitchen LaGiovani = new Kitchen(zonaDePizza);

        Cook bucatarMascarici = new Cook(zonaDePizza);
             bucatarMascarici.start();
        Waiter Valerio = new Waiter(zonaDePizza);
               Valerio.start();

    }
}
