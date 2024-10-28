package com.example.myapplication;

public class Music {
    private String Person;
    private String Track;

    public Music(String Person, String track)
    {
        this.Person = Person;
        this.Track = Track;
    }
    public String GetTrack()
    {
        return this.Track;
    }
    public String GetPerson()
    {
        return this.Person;
    }
}
