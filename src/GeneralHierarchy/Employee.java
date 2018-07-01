/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralHierarchy;

/**
 *
 * @author uclerpc
 */
public class Employee {
    private String name;
    private Employee manager;
    
    
    public Employee(){
        
    }
    
    public Employee(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
    
    
}
