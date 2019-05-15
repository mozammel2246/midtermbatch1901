package accounts;

import db.DbConnection;

import java.io.IOException;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class App {

    /**
     * @author Jahidul Islam
     * Use methods from the SalaryCalculator class to calculate salary of a employee
     *
     * */

    public static void main(String[] args) {
       /* SalaryCalulator.calculateMonthlySalary(1000);
        SalaryCalulator.calculateYearlySalary();*/

        //DbConnection.createTableFromStringToMySqlWithMultipleFields("employees", "firstName", "lastName", "dateOfBirth", "grossSalary", "netSalary");
        List<String> list = Arrays.asList("abc 01", "acb02");
        DbConnection.insertDataFromArrayListToMySql(list, "office", "officeAdd");
        /*List<String> list = Arrays.asList(("Rahim", "Karim", "Alam"),("NY", "MD", "NC"));
        DbConnection.insertDataWithArrayListToMySql(list, "student", "studentName", "studentAdd");*/
       /* List<String> a = Arrays.asList("Karim", "Rahim");
        List<String> b = Arrays.asList("NY", "MD");
        DbConnection.insertDataWithArrayListToMySql((a,b), );*/
    }
}
