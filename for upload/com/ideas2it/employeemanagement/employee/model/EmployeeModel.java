<<<<<<< HEAD:com/ideas2it/employeemanagement/employee/model/EmployeeModel.java
package com.ideas2it.employeemanagement.employee.model;

import java.sql.Date;
import java.util.ArrayList;

import com.ideas2it.employeemanagement.employee.model.EmployeeAddressModel;

/**
 * Plain old Java object for Employee Database. 
 * It contains specific details of employee
 * 
 * @version 3.0 03 Mar 2021
 * @author Sathvika Seshasayee
 */
public class EmployeeModel {
    private int id;
    private String name;
    private String designation;
    private double salary;
    private Date dob;           
    private long phoneNumber;
    private ArrayList<EmployeeAddressModel> addresses;
    
    public EmployeeModel (String name, String designation, double salary, 
                          Date date, long phoneNumber, 
                          ArrayList<EmployeeAddressModel> addresses) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.dob = date;
        this.addresses = addresses;
    }

    public EmployeeModel (String name, String designation, double salary, 
                          Date date, long phoneNumber) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.dob = date;
    }

    public EmployeeModel (int id) {
        this.id = id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setName(String newName) {
         this.name = newName;
    }

    public void setDesignation(String newDesignation) {
         this.designation = newDesignation;
    }

     public void setSalary(double newSalary) {
         this.salary = newSalary;
    }
 
    public void setDOB(Date newDOB) {
         this.dob = newDOB;    
    }

    public void setPhoneNumber(long newPhoneNumber) {
         this.phoneNumber = newPhoneNumber;
    }

    public void setAddresses(ArrayList<EmployeeAddressModel> address) {
         this.addresses = address;
    }

    public int getId() {
        return this.id;
    }   

    public String getName() {
        return this.name;
    }

    public String getDesignation() {
        return this.designation;
    }

    public double getSalary() {
        return this.salary;
    }

    public Date getDOB() {
        return this.dob;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public ArrayList<EmployeeAddressModel> getAddresses() {
        return this.addresses;
    }

    public String toString() {
        String addresses = ""; 
       if(null != this.addresses) {
        for(EmployeeAddressModel address: this.addresses) {
            if (address.getPinCode() != null) {
                addresses = addresses + address.toString()
                            + "\n";
            }        
        }
       }
        return    "Employee Id     : " + id  + "\nName          : " + name 
                + "\nDesignation   :  " + designation + "\nSalary        : " 
                + "Rs " + salary + "\nDate of Birth :  " + dob 
                + "\nPhone number  : " + phoneNumber + "\n\n"
                + addresses + "\n";
     }
=======
package com.ideas2it.employeemanagement.employee.model;

import java.sql.Date;
import java.util.ArrayList;

import com.ideas2it.employeemanagement.employee.model.EmployeeAddressModel;

/**
 * Plain old Java object for Employee Database. 
 * It contains specific details of employee
 * 
 * @version 3.0 03 Mar 2021
 * @author Sathvika Seshasayee
 */
public class EmployeeModel {
    private int id;
    private String name;
    private String designation;
    private double salary;
    private Date dob;           
    private long phoneNumber;
    private ArrayList<EmployeeAddressModel> addresses;
    
    public EmployeeModel (String name, String designation, double salary, 
                          Date date, long phoneNumber, 
                          ArrayList<EmployeeAddressModel> addresses) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.dob = date;
        this.addresses = addresses;
    }

    public EmployeeModel (int id) {
        this.id = id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setName(String newName) {
         this.name = newName;
    }

    public void setDesignation(String newDesignation) {
         this.designation = newDesignation;
    }

     public void setSalary(double newSalary) {
         this.salary = newSalary;
    }
 
    public void setDOB(Date newDOB) {
         this.dob = newDOB;    
    }

    public void setPhoneNumber(long newPhoneNumber) {
         this.phoneNumber = newPhoneNumber;
    }

    public void setAddresses(ArrayList<EmployeeAddressModel> address) {
         this.addresses = address;
    }

    public int getId() {
        return this.id;
    }   

    public String getName() {
        return this.name;
    }

    public String getDesignation() {
        return this.designation;
    }

    public double getSalary() {
        return this.salary;
    }

    public Date getDOB() {
        return this.dob;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public ArrayList<EmployeeAddressModel> getAddresses() {
        return this.addresses;
    }

    public String toStringProject() {
        return "Employee Id   : " + id  
               + "\nName          : " + name 
               + "\nDesignation   :  " + designation 
               + "\nPhone number  : " + phoneNumber + "\n";
    }

    public String toString() {
        String addresses = ""; 
        for(EmployeeAddressModel address: this.addresses) {
            if (address.getPinCode() != null) {
                addresses = addresses + address.toString()
                            + "\n";
            }        
        }
        return    "Employee Id     : " + id  + "\nName          : " + name 
                + "\nDesignation   :  " + designation + "\nSalary        : " 
                + "Rs " + salary + "\nDate of Birth :  " + dob 
                + "\nPhone number  : " + phoneNumber + "\n\n"
                + addresses + "\n";
     }
>>>>>>> 665f890bb8669ac259479e01d25d579ed7507da3:com/ideas2it/employeemanagement/model/EmployeeModel.java
}