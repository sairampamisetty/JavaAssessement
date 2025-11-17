package JavaAssessementTwo;
abstract class mobile{
    void brand()
    {
        System.out.println("Iphone 17 Pro Max");
    }
    void colour()
    {
        System.out.println("Orange");
    }
}
class laptop extends mobile
{
 void laptopName()
 {
     System.out.println("Lenovo");
 }
}
public class WithOutAbstract {
    public static void main(String[] args) {
        laptop lap=new laptop();
        lap.brand();
        lap.laptopName();
        lap.colour();
    }
}