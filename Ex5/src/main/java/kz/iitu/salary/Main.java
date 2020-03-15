package kz.iitu.salary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);

        Employees salaried = context.getBean("employee", Employees.class);






    }
}
