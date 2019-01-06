package com.company;

import java.util.ArrayList;

public class Company
{
    public String name;
    public ArrayList employees = new ArrayList();

    public Company(String setName)
    {
        this.name = setName;
    }

    public void addEmployee(Employee newEmployee)
    {
        this.employees.add(newEmployee);
    }
}

