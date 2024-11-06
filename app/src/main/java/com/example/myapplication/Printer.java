package com.example.myapplication;

public class Printer {
    private String Company;
    private String Name;
    private String Serial_Number;

    public Printer(String Company, String Name, String Serial_Number)
    {
        this.Company = Company;
        this.Name = Name;
        this.Serial_Number = Serial_Number;
    }
    public String GetCompany()
    {
        return this.Company;
    }
    public String GetName()
    {
        return this.Name;
    }
    public String GetSerial_Number()
    {
        return this.Serial_Number;
    }
}
