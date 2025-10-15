package emp;
public class Employe {

    String name;
    Double salary;

    public Employe(String name,Double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public Double getSalary()
    {
        return salary;
    }

    public String display()
    {
        return "Name: "+name+" Salary: "+salary;
    }

    
}