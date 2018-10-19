package com.company;

enum Type
{
    Foundamental, Specialization, Discipline;
}

enum Stream
{
    English, French, German;
}

public final class Course implements Comparable<Course>
{

   public Course(String setname, Type settype, Stream setstream, int setpoints)
   {
        this.name = setname;
        this.itsType = settype;
        this.itsStream = setstream;
        this.creditPoints = setpoints;
   }

   private String name;
   private Type itsType;
   private Stream itsStream;
   private int creditPoints;

   public void display()
   {
       System.out.print("\n\n\n___________________________\n");
       System.out.print("\n Name: " + this.name);
       System.out.print("\n Type: " + this.itsType);
       System.out.print("\n Strean: " + this.itsStream);
       System.out.print("\n Credit points: " + this.creditPoints);
   }

    @Override
    public int compareTo( final Course compareWith)
    {


        int firstCompare = this.name.compareTo(compareWith.name);

        return firstCompare;
    }




}
