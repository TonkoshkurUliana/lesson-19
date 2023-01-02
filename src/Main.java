import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) throws Exception, ClassNotFoundException {

        File file = new File("serailized.txt");
        Employee e = new Employee("Katy",5, 15000.50);
        Methods m = new Methods();
        m.serialize(e,file);
        System.out.println("File 1: " + m.deserealize(file));

        File file2 = new File("serializedEmployeeCollection.txt");
        List<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(e);
        listEmployee.add(new Employee("Andrew", 2, 1000.00));
        listEmployee.add(new Employee("Cristy", 4, 1200.00));
        m.serialize((Serializable) listEmployee,file2);
        System.out.println("File 2: " + m.deserealize(file2));
        }
}
