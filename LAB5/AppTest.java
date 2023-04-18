package LAB5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class AppTest {
    public static void main(String []args) throws ParseException {
        //initialize date formatter
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);

        //create project object
        Project project = new Project();
        //initialize project object with some values
        project.setProjectId("1");
        project.setStartDate( sdf.parse("06/24/2017"));
        project.setEndDate(sdf.parse("06/30/2017"));

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("1","PhamThaiQuoc",200,2,3));
        employeeArrayList.add(new Employee("2","Hasbulla",300,3,3));
        employeeArrayList.add(new Employee("3","Mario",350,2,1));
        employeeArrayList.add(new Employee("4","Sonic",350,1,1));

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