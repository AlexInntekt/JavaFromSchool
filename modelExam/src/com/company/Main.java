package com.company;

public class Main {

    public static void main(String[] args)
    {
        run();
        UI();
    }

    public static void UI()
    {
        Window wind = new Window();
               wind.setVisible(true);
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

        ThreadDispatcher dispatcher = new ThreadDispatcher(AKP);
                         dispatcher.start();

        AKP.addEmployee(El);
        AKP.addEmployee(Ion);

    }
}
