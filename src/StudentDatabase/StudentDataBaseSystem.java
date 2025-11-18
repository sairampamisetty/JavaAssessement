import java.util.*;

abstract class Database
{
    abstract void addStudent(Student s);
    abstract void updateStudent(String id, String name, String course, int marks);
    abstract void deleteStudent(String id);
    abstract void listStudents();
}

class personName
{
    private String id;
    private String name;

    public personName(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

class Student extends personName
{
    private String course;
    private int marks;

    public Student(String id, String name, String course, int marks) {
        super(id, name);
        this.course = course;
        this.marks = marks;
    }

    public String getCourse()
    {
        return course;
    }
    public void setCourse(String course)
    {
        this.course = course;
    }
    public int getMarks()
    {
        return marks;
    }
    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public void display()
    {
        System.out.println(this.getId() + " " + this.getName() + " " + course + " " + marks);
    }

    public void display(boolean showResult)
    {
        display();
        if (showResult)
        {
            System.out.println("Result: " + (marks >= 40 ? "Pass" : "Fail"));
        }
    }
}

class Teacher extends personName
{
    private String dept;

    public Teacher(String id, String name, String dept)
    {
        super(id, name);
        this.dept = dept;
    }

    public String getDept()
    {
        return dept;
    }
    public void setDept(String dept)
    {
        this.dept = dept;
    }


    public void display()
    {
        System.out.println(this.getId() + " " + this.getName() + " " + dept);
    }
}


class StudentListDB extends Database
{
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s)
    {
        students.add(s);
        System.out.println("Added student: " + s.getId());
    }

    public void updateStudent(String id, String name, String course, int marks)
    {
        for (Student s : students)
        {
            if (s.getId().equals(id))
            {
                s.setName(name);
                s.setCourse(course);
                s.setMarks(marks);
                System.out.println("Student updated: " + id);
                return;
            }
        }
        System.out.println("Student not found: " + id);
    }

    public void deleteStudent(String id)
    {
        Iterator<Student> it = students.iterator();
        while (it.hasNext())
        {
            Student s = it.next();
            if (s.getId().equals(id))
            {
                it.remove();
                System.out.println("Student deleted: " + id);
                return;
            }
        }
        System.out.println("Student not found: " + id);
    }

    public void listStudents()
    {
        if (students.isEmpty())
        {
            System.out.println("No students.");
        }
        else
        {
            for (Student s : students)
            {
                s.display(true); // method overloading in action
                System.out.println("---");
            }
        }
    }
}

public class StudentDataBaseSystem
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        StudentListDB db = new StudentListDB();
        String again="true";
        for(int i=1;again.equalsIgnoreCase("true");i++)
        {
            System.out.println("1.Add Student\n"+"2.View Student \n"+"3.Update Student\n"+"4.Delete Student \n"+"5.Exit");
            int ch = in.nextInt();
            in.nextLine();
            if (ch == 1)
            {
                System.out.print("ID: ");
                String id = in.nextLine();
                System.out.print("Name: ");
                String nm = in.nextLine();
                System.out.print("Course: ");
                String cr = in.nextLine();
                System.out.print("Marks: ");
                int mk = in.nextInt();
                db.addStudent(new Student(id, nm, cr, mk));
            }
            else if (ch == 2)
            {
                db.listStudents();
            }
            else if (ch == 3) {
                System.out.print("ID: ");
                String id = in.nextLine();
                System.out.print("New name: ");
                String nm = in.nextLine();
                System.out.print("New course: ");
                String cr = in.nextLine();
                System.out.print("New marks: ");
                int mk = in.nextInt();
                db.updateStudent(id, nm, cr, mk);
            }
            else if (ch == 4)
            {
                System.out.print("ID: ");
                String id = in.nextLine();
                db.deleteStudent(id);
            }
            else
            {
                break;
            }
        }
    }
}