package kz.iitu.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Salaried extends Employees {
    private String name;
    private int id;
    private double salary;
    private double total;


    public Salaried(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public double getTotalSalary()
    {
        total = salary;
        return total;
    }
    public String msg(){
        return "this is Salaried";
    }



    }
