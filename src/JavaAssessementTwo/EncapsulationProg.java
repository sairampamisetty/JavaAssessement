package JavaAssessementTwo;
class student
{
    private String name;
    private int age;
    private int rollNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class EncapsulationProg {
    public static void main(String[] args) {
        student std=new student();
        std.setName("Pawan");
        std.setAge(23);
        std.setRollNum(1);
        System.out.println("Student Name :"+std.getName());
        System.out.println("Student age :"+std.getAge());
        System.out.println("Student Roll Number :"+std.getRollNum());

    }
}
