package com.company;

public class Author
{
     String name;
     Publication[] publications = new Publication[10];
     int noPubl=0;

     public void addPublication(Publication addv)
     {
         this.publications[this.noPubl] = addv;
         this.noPubl += 1;
     }

     public double computeScore()
     {
         double sum=0;

         for(int i=0; i<this.noPubl; i++)
         {
             sum += this.publications[i].computeSum();
         }

         return sum;
     }
}
