package com.workintech.employeeApp.main;

import com.workintech.employeeApp.enums.Plan;
import com.workintech.employeeApp.model.Company;
import com.workintech.employeeApp.model.Employee;
import com.workintech.employeeApp.model.Healthplan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1, "Insurance X", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2, "Insurance Y", Plan.NORMAL);

        String[] healthplans = new String[3];
        healthplans[0] = plan1.getName();
        healthplans[1] = plan2.getName();

        Employee developer1 = new Employee(1, "Şamil Kafa", "samilkafa@gmail.com", "3141", healthplans);
        Employee developer2 = new Employee(2, "Edward Snowden", "snowden83@gmail.com", "3141", healthplans);
        developer1.addHealthplan(3, "Insurance X");
        System.out.println(developer1);

        System.out.println("********************************************");

        String[] developerNames = new String[5];
        developerNames[0] = developer1.getFullName();
        developerNames[1] = developer2.getFullName();

        Company company1 = new Company(1, "Workintech", 1000000000, developerNames);
        company1.addEmployee(3, "Şamil Kafa");
        System.out.println(company1);

        System.out.println("********************************************");
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
