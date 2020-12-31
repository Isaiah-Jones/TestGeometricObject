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
public class Rectangle extends GeoObject {
    
    private double width;
    private double height;
    
    public Rectangle(){
        
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height, String color, boolean filled){
          this.width = width;
        this.height = height;
        super.setColor(color);
        super.setFilled(filled);
    }
    
    //Return Width
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;   
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getArea(){
        return (width * height);
    }
    
    public double getPerimeter(){
        return 2 *(width * height);
    }
    
    @Override
    public String toString() {
        String newToString = super.toString();
         return("The rectangle is created " + getDateCreated() +
               " the width is " + width +" and its height is " + height + ".");
    }
}
