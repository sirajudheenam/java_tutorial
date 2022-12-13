## Install Java SDK

## Set JAVA_HOME and JDK_HOME
Add the following lines to `.bashrc` or `.zshrc` depends on your shell
export JAVA_HOME=/opt/homebrew/opt/openjdk/bin
export JDK_HOME=/Library/Java/JavaVirtualMachines/jdk-19.jdk/Contents/Home

## Check if correctly set 
env | grep JAVA
env | grep JDK

``` bash
mkdir java_example/animal
cd java_example

cat << EOF > animal/Dog.java
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
EOF

cat << EOF > Main.java
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
EOF
```

## Compile the files first
```
javac animal/Dog.java
javac Main.java
```

## Run the java file
```
java Main.java
```

## TO DO 

- Learn about packages
- Inheritance
- Polymorphism