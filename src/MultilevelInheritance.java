class GrandFather {
    void property() {
        System.out.println("Property goes to father");
    }
}
class Father extends GrandFather{
    void propertyGrand()
    {
        System.out.println("Property goes to Son");
    }
}
class Son extends Father{
    void propertyFather()
    {
        System.out.println("Property goes to OldAgeHome");
        }
}

public class MultilevelInheritance {
   public static void main(String[] args){
       Son son=new Son();
       son.property();
       son.propertyGrand();
       son.propertyFather();
    }
}

