package kz.iitu.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Salaried_Comission extends Employees {
    private String name;
    private int id;
    private double salary;
    private double sells;
    private double total;



    public Salaried_Comission(String name, int id, double salary, double sells){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public double getTotalSalary()
    {
        total = salary + sells * 0.02;
        return total;
    }


    public String msg(){
        return "this is Salaried_Comission";
    }


}
