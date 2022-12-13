package main;

import animal.Dog; 

public class Main {

  public static void main(String[] args) {
    Dog dogObj = new Dog();
    // This gives an error as static method cant be accessed 
    // outside the package, if they are not public
    Dog.eat(); 
    dogObj.run();
  }
}
