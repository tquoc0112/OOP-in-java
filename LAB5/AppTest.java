package LAB5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class AppTest {
    public static void main(String []args) throws ParseException {
        //initialize date formatter
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        //create project object
        Project project = new Project();
        //initialize project object with some values
        project.setProjectId("1");
        project.setStartDate( sdf.parse("17/03/2023"));
        project.setEndDate(sdf.parse("01/12/2023"));

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("1","PhamThaiQuoc",500,4,4));
        employeeArrayList.add(new Employee("2","Hasbulla",460,3,3));
        employeeArrayList.add(new Employee("3","Mario",490,2,2));
        employeeArrayList.add(new Employee("4","Sonic",450,1,1));

        project.setListOfEmployees(employeeArrayList);

        System.out.println("Project toString method result :\n"+project);
        System.out.println("Project Budget : "+project.estimateBudget());

        System.out.println();

        System.out.println("Project Details From Project Printer : ");
        ProjectPrinter projectPrinter=new ProjectPrinter(project);
        Thread t1 = new Thread(projectPrinter);
        t1.start();
    }
}