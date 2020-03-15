package kz.iitu.salary;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class EmployeesFactory {
    @Autowired
    public static Employees getEmployee(EmployeeType type,
                               String name, int id, double salary ){
        Employees c=null;
        switch (type){
            case Salaried:
                c = new Salaried(name, id, salary);
                break;

            case Hourly:
                c = new Hourly(name, id, salary);
                break;

        }
        return c;
    }
    @Autowired
    public static Employees getEmployee(EmployeeType type,
                                          String name, int id,double salary, double sells){
        Employees c=null;
        switch (type){
            case Comission:
                c = new Comission(name, id, salary, sells);
                break;
            case Salaried_Comission:
                c = new Salaried_Comission(name, id, salary, sells);
                break;
        }
        return c;
    }


}
