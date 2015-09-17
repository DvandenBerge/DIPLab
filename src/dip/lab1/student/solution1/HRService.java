package dip.lab1.student.solution1;

import java.util.ArrayList;

/**
 * @author dvandenberge
 */
public class HRService {
    private  ArrayList<IEmployee> employees;
    
    public HRService(){
        employees=new ArrayList(2);
    }
    
    public void addEmployee(IEmployee e){
        if(e instanceof IEmployee){
            employees.add(e);
        }else{
            System.out.println("Object cannot be added to staff");
        }
    }
    
    public double getAnnualWages(int x){
        return employees.get(x).getAnnualWages();
    }
    
    public ArrayList<IEmployee> getStaff(){
        return employees;
    }
}
