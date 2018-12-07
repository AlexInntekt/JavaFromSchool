package com.company;
import java.util.UUID;

public class Event
{
    String type;
    String id;

    public Event(String setType)
    {
        this.type=setType;
        this.id=UUID.randomUUID().toString();
    }
}
