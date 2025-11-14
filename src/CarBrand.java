class car {
    car()
    {
        String brand = "Rolls Royce";
        System.out.println(brand);
    }

    car(String brand) {
        System.out.println(brand);
    }
}

public class CarBrand {
    public static void main( String[] args) {
        car c= new car();
        car c2=new car("Range Rover");

    }
    }

