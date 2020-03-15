package kz.iitu.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Comission extends Employees {
    private String name;
    private int id;
    private double salary;
    private double sells;
    private double total;

    public Comission(String name, int id, double salary, double sells){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.sells=sells;
    }


    public double getTotalSalary()
    {
        total =  sells * salary/100;
        return total;
    }



    public String msg(){
        return "this is Comission";
    }


}
