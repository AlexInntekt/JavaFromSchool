package com.company;

public class Main {

    public static void main(String[] args)
    {
        run();

    }

    public static void UI()
    {

    }

    public static void run()
    {


        Engineer Joe = new Engineer(12,"Joe");
        Engineer Steve = new Engineer(4,"Steve");
        Engineer El = new Engineer(5,"Eleanour");
        Manager Ion = new Manager(4,"Ion");

        Company AKP = new Company("AKP");


        AKP.addEmployee(Joe);
        AKP.addEmployee(Steve);

        EmployeeMonitor dispatcher = new EmployeeMonitor(AKP);
                         dispatcher.start();

        AKP.addEmployee(El);
        AKP.addEmployee(Ion);

        Window wind = new Window(AKP);
        wind.setVisible(true);




    }
}
