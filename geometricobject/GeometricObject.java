/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricobject;

/**
 * Mr.Osborne
 * CSC 206
 * @author Isaiah J Jones
 * 4-26-17
 */
public class GeometricObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GeoObject myObject = new GeoObject("black",true);
       System.out.println(myObject.toString());
       
       Circle myCircle = new Circle(1);
        System.out.println(myCircle.toString());
        
       Circle nuthaCircle = new Circle();
       nuthaCircle.setRadius(5);
       nuthaCircle.setColor("blue");
       nuthaCircle.setFilled(true);
       System.out.println(nuthaCircle.toString());
       
       Rectangle myRectangle = new Rectangle(2, 4);
       String rString = myRectangle.toString();
       System.out.println("\nmyRectangle: \n " + rString);
       double rArea = myRectangle.getArea();
       System.out.println("The area is " + rArea);
       double rPerimeter = myRectangle.getPerimeter();
       System.out.println("The perimeter is " + rPerimeter);
       
       
       displayObject(myCircle);
       displayObject(myRectangle);
    }

    private static void displayObject(GeoObject object) {
        System.out.println("Created on " + object.getDateCreated()+
        ". Color is " + object.getColor());
        
        if(object instanceof Circle){
            System.out.println(" and the radius is " + ((Circle) object).getRadius());
        }
    }
    
}
