package IB_QUESTIONS.src.university.attempt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Connector {

    public static Statement createStatement() {
        String user = "root",
                password = "",
                url = "jdbc:mysql://localhost:3306/registration";
        Statement st2 = null;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Driver loaded");
            st2 = conn.createStatement();
            System.out.println("Statement created");
            System.out.println(st2);
            String query = "CREATE TABLE IF NOT EXISTS register(Firstname VARCHAR (50),Other_names VARCHAR(20),Lastname VARCHAR(50),Date_Of_Birth DATE,Gender VARCHAR(20),Registration_Number VARCHAR (50)Primary key)";
            String query2 = "CREATE TABLE IF NOT EXISTS identity(Student_id VARCHAR (50),Registration_Number VARCHAR (50),Matric_Number VARCHAR (50) ,Facaulty VARCHAR (50),Department VARCHAR (50), FOREIGN KEY (Registration_Number) REFERENCES register(Registration_Number))";
            String query3 = "CREATE TABLE IF NOT EXISTS Facaulty(Facaultytid int UNIQUE KEY,Facaultyname varchar (20))";
            String query4 = "create TABLE IF NOT EXISTS Course(courseid int UNIQUE KEY,Science Varchar (30),Art Varchar (30),Agriculture_Forestry Varchar (30),Pharmacy Varchar (30),Social_Science Varchar (30),Business Varchar (30))";
            String query8 = "CREATE TABLE IF NOT EXISTS professor(Firstname VARCHAR (50),Other_names VARCHAR(20),lastname VARCHAR (50),Date_Of_Birth DATE,Phone_Number VARCHAR (20) UNIQUE key,Gender VARCHAR (20),Office_hrs int)";

            String query9 = "CREATE TABLE IF NOT EXISTS StudentInformation(Firstname VARCHAR (50),Lastname VARCHAR (50),Other_names VARCHAR(20),Phone_Number VARCHAR (20) ,Matric_Number VARCHAR (50),Registration_Number VARCHAR (50),Facaulty VARCHAR (50),Department VARCHAR (50),Gender VARCHAR (20))";
           
            // For storing student Results for every subject in diffrent courses
            String query10 = "CREATE TABLE IF NOT EXISTS ArtStudentsresults(Student_id VARCHAR (50),Subject1 int,Subject2 int,Subject3 int,Subject4 int,Subject5 int,Subject6 int,Subject7 int)";
            String query11 = "CREATE TABLE IF NOT EXISTS ScienceStudentsresults(Student_id VARCHAR (50),Subject1 int,Subject2 int,Subject3 int,Subject4 int,Subject5 int,Subject6 int,Subject7 int)";
            String query12 = "CREATE TABLE IF NOT EXISTS PharmacyStudentsresults(Student_id VARCHAR (50),Subject1 int,Subject2 int,Subject3 int,Subject4 int,Subject5 int,Subject6 int,Subject7 int)";
            // String query5 = "INSERT INTO Facaulty
            // VALUES(1,'Science'),(2,'Art'),(3,'Agriculture_Forestry'),(4,'Pharmacy'),(5,'Social_Science'),(6,'Business')";
            // String query6 = "INSERT INTO Course VALUES(1,'Computer
            // Science','Literature','Fishing','Bio Chemistry','social
            // Networking'),(2,'Science','Science','Science','Science','Science')";
            st2.execute(query);
            System.out.println("Register Table created!");
            st2.execute(query2);
            System.out.println("Identity Table created!");
            st2.execute(query3);
            System.out.println("Faculty Table created!");
            st2.execute(query4);
            System.out.println("professor Table created!");
            st2.execute(query8);
            System.out.println("Department Table created!");
            st2.execute(query9);
            System.out.println("ArtStudentsresults Table created!");
            st2.execute(query10);
            System.out.println("ScienceStudentsresults Table created!");
            st2.execute(query11);
            System.out.println("PharmacyStudentsresults created!");
            st2.execute(query12);
            System.out.println("Query executed");
        } catch (SQLException e) {
            System.out.println("Error occurred: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Server Communications Failure!", "Error Occured!", 0);
            System.exit(0);
        }
        return st2;
    }
}
