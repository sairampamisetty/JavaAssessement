package JavaAssessementTwo;

class Bike {
    public String vehicleName = "KTM";
    public void publicMeth()
    {
        System.out.println("Bike name is KTM");
    }
    private String vehicleRC = "KTM837409";
    private void privateMeth()
    {
        System.out.println("RC Number");
    }
    protected String vehicleModel = "KTM DUKE";
    protected void protectedMeth()
    {
        System.out.println("model is Duke");
    }
    String vehicleColour = "orange";
        void defaultMeth()
        {
            System.out.println("Colour is Orange");
        }

public void display()
{
    System.out.println(vehicleName);
    System.out.println(vehicleRC);
    System.out.println(vehicleModel);
    System.out.println(vehicleColour);

    publicMeth();
    privateMeth();
    protectedMeth();
    defaultMeth();
}
}
public class AccessModifiersProg {
    public static void main(String[] args) {
         Bike bike=new Bike();
        System.out.println(bike.vehicleName);
        bike.publicMeth();
       // System.out.println(bike.vehicleRC); private is Not Accessible
       // bike.privateMeth();
        System.out.println(bike.vehicleModel);
        bike.protectedMeth();
        System.out.println(bike.vehicleColour);
        bike.defaultMeth();

        bike.display();
    }
}
