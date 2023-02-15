package com.cognizant.shapes;

class Rectangle{
void calculateArea()
{
System.out.println("the area of the rectangle is calculated using the formula length * breath");
}
}
public class AreaCalculator{
public static void main(String [] abc){
Rectangle rectangle = new Rectangle();
rectangle.calculateArea();
}
}