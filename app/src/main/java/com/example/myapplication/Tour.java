package com.example.myapplication;

public class Tour {
    private String Tour;
    private String Country;
    private String Money;

    public Tour(String Tour, String Country, String Money)
    {
        this.Tour = Tour;
        this.Country = Country;
        this.Money = Money;
    }
    public String GetCompany()
    {
        return this.Tour;
    }
    public String GetName()
    {
        return this.Country;
    }
    public String GetSerial_Number()
    {
        return this.Money;
    }
}
