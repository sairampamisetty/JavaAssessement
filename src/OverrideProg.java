class parent
{
    void message()
    {
        System.out.println("Parent Method");
    }
}
class child extends parent
{
    @Override
    void message()
    {
        System.out.println("Child method");
    }
}
public class OverrideProg {
    public static void main(String[] args) {
        child c=new child();
        c.message();
    }
}
