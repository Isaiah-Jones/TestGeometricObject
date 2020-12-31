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
public class Circle extends GeoObject {
    
    //Instance Variables
    private double radius;
    
    
    //Constructors
   public Circle(){
       super("black", true);
   }
   
   public Circle(double radius){
       this.radius = radius;
   }
   
   public Circle(double radius, String color, boolean filled){
       this.radius = radius;
       super.setColor(color);
       setFilled(filled);
   }
    
    //Methods
   public double getRadius(){
       return radius;
   }
   
   public void setRadius(double radius){
       this.radius = radius;
   }
   
   public double getArea(){
       return Math.pow(radius, 2) * Math.PI;
   }
   
   public double getDiameter(){
       return radius * 2;
   }
   
   public double getCircumference(){
       return 2 * radius * Math.PI;
   }
    
   @Override
   public String toString(){
       return("The circle is created " + getDateCreated() +
               " and the radius is " + radius);
   }
}
