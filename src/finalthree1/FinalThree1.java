/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalthree1;

/**
 *
 * @author Balraj
 */
public class FinalThree1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double netSalary;
        double hours = 8.0;
        double payRate = 50.0;
        double tax = 100.0;

         CalculateSalary calculate= new  CalculateSalary();
         
        netSalary = calculate.calculateNet(hours, payRate, tax);
        System.out.println("Net Salary is "+netSalary);
               
        
        
    }
    
}
