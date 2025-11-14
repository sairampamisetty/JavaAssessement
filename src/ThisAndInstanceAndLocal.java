 class person {
     String name;
     int age;

     public person(String name, int age) {
         this.name = name;
         this.age = age;
     }

     void display() {
         System.out.println("Name of a Person is:" + name);
         System.out.println("Age of the Person is:" + age);
     }
 }
     public class ThisAndInstanceAndLocal{
         public static void main(String[] args)
         {
             person p=new person("Sairam",23);
             p.display();
         }
     }





