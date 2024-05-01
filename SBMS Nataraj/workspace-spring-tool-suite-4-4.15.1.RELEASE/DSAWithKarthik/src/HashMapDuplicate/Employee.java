package HashMapDuplicate;

public class Employee {
    String empName;
   int empId;
   // Integer empId;

    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /*@Override
    public int hashCode() {
        return empId;
    }

    @Override
    public boolean equals(Object obj) {
        // Object Typecasting
        // inheritance
        Employee emp = (Employee) obj;
        // Employee emp = new Employee();
        if (empId == emp.empId) {
            return true;
        } else {
            return false;
        }
    }*/
}
