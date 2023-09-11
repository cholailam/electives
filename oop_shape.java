class Shapes{  
    float findArea() {
        return (-1);
    }
} 

class Square extends Shapes{
    float side;
    Square(float s) {
        side = s;
    }
    
    float findArea() {
        return (side*side);
    }  
}

class Triangle extends Shapes{
    float base, height;
    Triangle(float b, float h) {
        base = b;
        height = h;
    }
    
    float findArea() {
        return (base*height/2);
    }  
}
class Circle extends Shapes{
    float radius;
    Circle(float r) {
        radius = r;
    }
    
    float findArea() {
        return ((float) 3.14*radius*radius);
    }  
}

class Trapezium extends Shapes{
    float upper, lower, height;
    Trapezium(float up, float low, float h) {
        upper = up;
        lower = low;
        height = h;
    }
    
    float findArea() {
        return ((upper+lower)*height/2);
    }  
}

class Testing {  

public static void main(String args[]){

Square mySquare = new Square(5);
Triangle myTriangle = new Triangle(3,4);
Circle myCircle = new Circle(5);
Trapezium myTrap = new Trapezium(3,4,5);

System.out.println(mySquare.findArea());
System.out.println(myTriangle.findArea());
System.out.println(myCircle.findArea());
System.out.println(myTrap.findArea());
}    
} 

