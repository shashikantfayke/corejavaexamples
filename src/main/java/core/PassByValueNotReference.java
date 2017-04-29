package core;

import domain.Dog;

public class PassByValueNotReference {

    public static void main(String[] args) {

        Dog dog = new Dog("Jimmy");

        foo(dog);
        if (dog.getName().equals("Jimmy")){
            System.out.println("Java is Pass by Value ");

        } else if(dog.getName().equals("Max")){

            System.out.println("Java is Pass by  Reference");
    }

    }

    private static void foo(Dog dog) {

        System.out.println(dog.getName().equals("Jimmy"));
        dog=new Dog("Max");
        System.out.println(dog.getName().equals("Max"));
    }

}