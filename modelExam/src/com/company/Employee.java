package com.company;

public abstract class Employee
{
    Employee(String setName)
    {
        this.name = setName;
    }

    public String name;
    public abstract double getSalary();

    @Override public String toString()
    {
        return("Name of employee: " + this.name);
    }
}


