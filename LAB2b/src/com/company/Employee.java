package com.company;
import java.util.GregorianCalendar;

 class Employee implements Comparable<Employee>
{
    int id;
    String name;
    GregorianCalendar bday;

    Employee(int setid, String setname, GregorianCalendar setcalendar)
    {
        this.id = setid;
        this.name = setname;
        this.bday = setcalendar;
    }

    @Override
    public int compareTo( final Employee o)
    {
        int result=0;

        if(this.id<o.id)
        {
            result = -1;
        }
        if(this.id>o.id)
        {
            result = 1;
        }

            result = this.name.compareTo(o.name);

            if(result==0)
            {
                result = this.bday.compareTo(o.bday);
            }



        return result;
    }
}
