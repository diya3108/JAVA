//Write a java program to use simple inheritance.

class Animal{
    String name = "Animal";
    void eat (){
          System.out.println("This animal eats food.");
    }
  
}

class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks:Woof!Woof!");
    }
}

public class U2_P1{
    public static void main(String args[]){
        Dog mydog = new Dog();
        mydog.eat();
        mydog.bark();
    }
}
