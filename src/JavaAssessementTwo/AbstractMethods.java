package JavaAssessementTwo;
abstract class Bankaccount{
    public abstract void deposit();
    public  abstract void withDraw();
}
class savingsAccount extends Bankaccount{

    public void withDraw() {
        System.out.println("The Withdraw Amount is 20000 ");
    }

    public void deposit() {
        System.out.println("The Deposit amount is 30000 ");
    }
}
public class AbstractMethods {
    public static void main(String[] args) {
        savingsAccount sa=new savingsAccount();
        sa.deposit();
        sa.withDraw();

    }
}
