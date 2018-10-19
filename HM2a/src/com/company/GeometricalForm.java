package com.company;



public abstract class GeometricalForm  implements FormOperations
{
    int xCoord;
    int yCoord;
    String iColor;
    String fColor;

    public GeometricalForm(int x, int y)
    {

    }

    public int getXCoordinate()
    {
        return this.xCoord;
    }

    public int getYCoordinate()
    {
        return this.yCoord;
    }

    public String getInnerColor()
    {
        return this.iColor;
    }

    public String getFormColor()
    {
        return this.fColor;
    }

}

