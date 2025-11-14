class sum{
    int num1;
    int num2;
    sum(int num1,int num2)
    {
        int sum=num1+num2;
        System.out.println("The sum of two numbers is :"+sum);
    }
}
public class ParameterConstructor {
    public void main(String[] args)
    {
        sum s=new sum(15,20);
    }

}
