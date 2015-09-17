package dip.lab1.student.solution1;

/**
 * @author dvandenberge
 */
public class Driver {
    public static void main(String[] args) {
        HRService department1 = new HRService();
        IEmployee employee1 = new HourlyEmployee(11,2087);
        IEmployee employee2 = new SalariedEmployee(25000,200);
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        //System.out.println(department1.getAnnualWages(1));
        for(int i=0;i<department1.getStaff().size();i++){
            System.out.println(department1.getAnnualWages(i));
        }
    }
}
