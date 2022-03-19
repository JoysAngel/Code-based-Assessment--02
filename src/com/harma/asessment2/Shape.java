package com.harma.asessment2;
abstract class Shape{
    abstract void RectangleArea(int l,int b);
    abstract void SquareArea(int s);
    abstract void CircleArea(int r);
}

    class Area extends Shape{

        void RectangleArea(int l, int b) {
            System.out.println("The Area of the rectangle is ="+(l*b));
        }

        void SquareArea(int s) {
            System.out.println("The Area of the Square is ="+(s*s));
        }

        void CircleArea(int r) {
            System.out.println("The Area of the circle is ="+(3.14*r*r));
        }
    }

    class Main{
        public static void main(String[] args) {
            Shape shapeObj = new Area();
            shapeObj.RectangleArea(34,10);
            shapeObj.CircleArea(20);
            shapeObj.SquareArea(37);
        }
    }

