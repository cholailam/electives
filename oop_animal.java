class Animal{  
    String name = "No name";
    
    void setName(String n) {
        name = n;
    }
    
    void speak(){
     System.out.println(name+": Hello!");
    } 
} 

//Dog inherits Animal class
class Dog extends Animal{

    //This customized method (function) "overrides" the parent version
    void speak() {
        System.out.println(name+": Woof!");
    }  
}

//Cat also inherits Animal class
class Cat extends Animal{  
    void speak() {
        System.out.println(name+": Meow!");
    }  
}  

class Sheep extends Animal{
    void speak(){
        System.out.println(name+": Meeeeeehhhhhhh!");
    }
}

//Main Program
class Testing {  

public static void main(String args[]){
Dog dogA = new Dog();
Dog dogB = new Dog();
Cat catA = new Cat();
Sheep shpA = new Sheep();

dogA.setName("Bobby");
dogB.setName("Goofy");
catA.setName("Jerry");
shpA.setName("Qwerty");

dogA.speak();
dogB.speak();
catA.speak();
shpA.speak();
}
    
} 
