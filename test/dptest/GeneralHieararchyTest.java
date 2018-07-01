/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dptest;
import GeneralHierarchy.Employee;
import GeneralHierarchy.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author uclerpc
 */
public class GeneralHieararchyTest {
    
    private Manager bayram;
    private Employee ali;
    private Employee veli;
    
            
    @Before
    public void setUp(){
        
        bayram = new Manager("Bayram UCLER");
        ali = new Employee("Ali YILMAZ"); 
        veli = new Employee("Veli BARAN");
    }
    
    @Test
    public void employeeTest(){
        
        bayram.addEmployee(ali);
        bayram.addEmployee(veli);
        
        
        System.out.println("This is Ali's manager: " + ali.getManager().getName());
        System.out.println("This is Veli's manager: "+ veli.getManager().getName());
        System.out.println("The employees of Bayram are: "+ bayram.getEmployeeList().get(0).getName()+ ", "+ bayram.getEmployeeList().get(1).getName());
        
        assertEquals("Bayram UCLER", ali.getManager().getName());
        assertEquals("Ali YILMAZ", bayram.getEmployeeList().get(0).getName());
        

    }
    
    
}
