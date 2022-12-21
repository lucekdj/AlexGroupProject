package com.devxschool;

public class Demo {

    public static void main(String[] args) {
        /**
         * Create 2 interfaces: Movable and Soundable
         * In Movable interface:
         * - Create a string variable 'message' that holds a text "This animal can move"
         * - Add an abstract method move() of type void
         * - Add a default method that returns a message
         * - Add a static method printMessage() and print a message + " - Hi, I am a movable and this is a STATIC method"
         * In Soundable interface:
         * - Add an abstract method sound() of type void
         * Create 3 classes: Cat, Dog and Fish
         * In Cat class:
         * - inherit from Movable and Soundable interfaces
         * - Add a static constant variable 'message' with value "This message is from Cat"
         * - Override move() method and print "Cat can run about 30 mph"
         * - Override getMessage() method and print message + " - Hi, I am a Cat and this is an INSTANCE method"
         * - Override sound() method and print "Meow"
         * - add a static method printMessage() and print message + " - Hi, I am a Cat and this is a STATIC method"
         * In Dog class:
         * - inherit from Movable and Soundable interfaces
         * - Override move() method and print "Dogs can run from 15 mph and greyhound can reach is 45 mph"
         * - Override getMessage() method and print message + " - Hi, I am a Dog and this is an INSTANCE method"
         * - Override sound() method and print "Bark"
         * In Fish class:
         * - inherit from Movable interface
         * - Override move() method and print "Fish swims in the water from 2 mph and white shark can reach 35 mph"
         *
         * In this Demo class:
         * 1)
         * - Create objects Cat, Dog and Fish of type Movable
         * - Create objects Cat and Dog of type Soundable
         * - Create 3 objects of each type
         *
         * - discuss in the group on '#'
         *
         * 2)
         * - Get messages and print out for objects of cat1,cat3,dog1,dog3,fish1,fish3
         *      # explain why you have two different objects of movable type and same type, but printing same message
         *      # explain why cat objects are printing message from Cat only
         *      # explain why dog objects are printing message from Movable and Dog
         *      # explain why fish objects are printing message from Movable only
         * 3)
         * - call printMessage method from Movable and Cat
         *      # explain why you have called same method but having different output
         * 4)
         * - call move method for objects of cat1;dog1;fish1;cat3;dog3;fish3;
         *      # explain why you have objects of movable type and same type but printing same message
         *      # what are the differences between methods of move and getMessage
         * 5)
         * - call method sound for objects cat2,cat3,dog2,dog3
         *      # explain why you can not call sound method for movable objects
         *      # explain why you can not call sound method for fish objects
         */

        Movable cat1 = new Cat();
        Movable dog1 = new Dog();
        Movable fish1 = new Fish();

        Soundable cat2 = new Cat();
        Soundable dog2 = new Dog();

        Cat cat3 = new Cat();
        Dog dog3 = new Dog();
        Fish fish3 = new Fish();

        System.out.println(cat1.getMessage());
        System.out.println(cat3.getMessage());
        System.out.println(dog1.getMessage());
        System.out.println(dog3.getMessage());
        System.out.println(fish1.getMessage());
        System.out.println(fish3.getMessage());

        Movable.printMessage();
        Cat.printMessage();

        cat1.move();
        dog1.move();
        fish1.move();
        cat3.move();
        dog3.move();
        fish3.move();

        cat2.sound();
        dog2.sound();
        cat3.sound();
        dog3.sound();
    }
}
