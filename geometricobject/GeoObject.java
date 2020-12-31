/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricobject;

/**
 *
 * @author I_jones2105
 */
public class GeoObject {

    //Intance variables
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    //Constructors
    public GeoObject() {
        dateCreated = new java.util.Date();
    }

    public GeoObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    //Methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolor: "
                + color + " and filled: " + filled;
    }
}
