/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralHierarchy;

import java.util.ArrayList;

/**
 *
 * @author uclerpc
 */
public class Manager extends Employee{
    
    private ArrayList<Employee> employeeList;
    
    public Manager(String name){
        super(name);
        employeeList = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee){
        employeeList.add(employee);
        employee.setManager(this);
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    
  
}
