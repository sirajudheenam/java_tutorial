package animal;
public class Dog {
  
  // Static method - can be called within the class without 
  // creating an object for the class.
  static void eat() {
    System.out.println("Static Method");
    System.out.println("I am eating !!");
  }

  // Public method - exposed to outside package
  public void run() {
    System.out.println("Public Method");
    System.out.println("I am running !!");
  }

  // Main method
  public static void main(String[ ] args) {
    eat();

    Dog dogObj = new Dog(); // Create an object of Main
    dogObj.run(); // Call the public method
  }
}
