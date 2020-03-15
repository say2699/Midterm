package kz.iitu.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employees {
    protected String name;
    protected int id;
    private double salary;
    private EmployeeType type;


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getID(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }
}
