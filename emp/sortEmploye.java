package emp;
import java.util.*;
public class sortEmploye {
    public static void main(String[] args) {
        List<Employe> emp=new ArrayList<>();
        emp.add(new Employe("A",5000.0));   
        emp.add(new Employe("B",3000.0));
        emp.add(new Employe("C",7000.0));
        emp.add(new Employe("D",6000.0));

        emp.sort((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary()));

        for(Employe e:emp)
        {
            System.out.println(e.display());
        }
    }
    
}
