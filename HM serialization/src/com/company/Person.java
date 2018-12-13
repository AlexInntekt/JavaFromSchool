package com.company;

public class Person implements java.io.Serializable
{
    public String name;
    public String surname;
    public transient int SSN;
    public int age;
    public String gender;
    public String city;
    public String country;
    public String adress;

    public Person(String setName, String setSurname, int setSSN, int setAge, String setGender, String setCity, String setCountry, String setAdress)
    {
        this.name = setName;
        this.surname = setSurname;
        this.SSN = setSSN;
        this.age = setAge;
        this.gender = setGender;
        this.city = setCity;
        this.country = setCountry;
        this.adress = setAdress;
    }



}