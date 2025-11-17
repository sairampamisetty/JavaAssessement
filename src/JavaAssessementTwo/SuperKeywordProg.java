package JavaAssessementTwo;
class vehicle{
    vehicle(){
        System.out.println( "My bike Name KTM");
    }
}
class vehicleModel extends vehicle
{
    vehicleModel()
    {
        super();
        System.out.println("My vehicle model is KTM DUKE ");
    }
}
public class SuperKeywordProg {
    public static void main(String[] args) {
        vehicleModel vm=new vehicleModel();
    }
}
