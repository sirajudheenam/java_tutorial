package animal;
public class Dog {
  // Static method - can be called within the class without 
  // creating an object for the class.
  static void eat() {
    System.out.println("[static]:- I am eating now.. would you like to eat something? ");
  }

  // Public method - exposed to outside package
  public void run() {
    System.out.println("[public]:- I am running now.. would you like to run as well? ");
  }
  
  public static void main(String[ ] args) {
    eat();
    Dog dogObj = new Dog();
    dogObj.run();
  }
}
