class Addition{
    void add(int num1, int num2)
    {
        System.out.println("Sum of two numbers is :"+(num1+num2));
    }
    void add( int num1,int num2,int num3)
    {
        System.out.println("Sum of two numbers is :"+(num1+num2+num3));
    }
}
public class AddMethodOverloading {
    public static void main(String[] args)
    {
        Addition addition=new Addition();
        addition.add(35,45);
        addition.add(56,28,-23);

    }
}
