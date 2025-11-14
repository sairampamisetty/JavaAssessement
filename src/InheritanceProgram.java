class Animal {
    void eat() {
        System.out.println("Eating Food ");
    }
}
    class Dog extends Animal
    {
       void  bark()
        {
         System.out.println("Barking Loudly");
        }
    }

public class InheritanceProgram {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();
        dog.eat();

    }
}
