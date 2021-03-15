package mysql;

import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/bankomat";
    private static final String user = "root";
    private static final String password = "1qayxsw23edc";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kontonummer;
        String pin;


        // pinEingabe();
        // readDatabaseKonto();
        // readDatabaseTransaktionen();
        // insertDatabaseTransaktionen();
        // updateDataTransaktionen();
        // deleteDataTransaktion();
        // prepareStatmentsDemoEmployees();
        // metaDataBasicInfo();
        // metadataTableColumnInfo();
    }

    private static void metadataTableColumnInfo() {
        String catalog = null;
        String schemaPettern = null;
        String tableNamePattern = null;
        String columnNamePattern = null;
        String[] types = null;

        Connection conn = null;
        ResultSet rs = null;

        try {
            //1.Get connected to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", user, password);
            //2.Get metadata
            DatabaseMetaData databaseMetaData = conn.getMetaData();
            //3.Get list of table
            System.out.println("List of tables");
            System.out.println("--------------");
            rs = databaseMetaData.getTables(catalog, schemaPettern, tableNamePattern, types);
            while (rs.next()) {
                System.out.println(rs.getString("TABLE_NAME"));
            }
            //4.Get list of column
            System.out.println("\n\nList of column");
            System.out.println("--------------");
            rs = databaseMetaData.getColumns(catalog, schemaPettern, "employees", columnNamePattern);
            while (rs.next()) {
                System.out.println(rs.getString("COLUMN_NAME"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                conn.close();
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    private static void metaDataBasicInfo() {
        Connection conn = null;
        //1.Get a connection to database
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", user, password);
            //2.Get metadata
            DatabaseMetaData databaseMetaData = conn.getMetaData();
            //3.Display info about database
            System.out.println("Product name: " + databaseMetaData.getDatabaseProductName());
            System.out.println("Produkt version: " + databaseMetaData.getDatabaseProductVersion());
            System.out.println();
            //4.Display info about JDBC Driver
            System.out.println("JDBC Driver name: " + databaseMetaData.getDriverName());
            System.out.println("JDBC Driver name: " + databaseMetaData.getDriverVersion());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void prepareStatmentsDemoEmployees() {
        Connection myConn = null;
        PreparedStatement myStmt = null;
        ResultSet myRs = null;
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", user, password);
            // 2. Prepare statement
            myStmt = myConn.prepareStatement("select * from employees where salary > ? and department=?");
            // 3. Set the parameters
            myStmt.setDouble(1, 80000);
            myStmt.setString(2, "Legal");
            // 4. Execute SQL query
            myRs = myStmt.executeQuery();
            // 5. Display the result set
            display(myRs);
            //
            // Reuse the prepared statement:  salary > 25000,  department = HR
            //
            System.out.println("\n\nReuse the prepared statement:  salary > 25000,  department = HR");
            // 6. Set the parameters
            myStmt.setDouble(1, 25000);
            myStmt.setString(2, "HR");
            // 7. Execute SQL query
            myRs = myStmt.executeQuery();
            // 8. Display the result set
            display(myRs);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void display(ResultSet myRs) throws SQLException {
        while (myRs.next()) {
            String lastName = myRs.getString("last_name");
            String firstName = myRs.getString("first_name");
            double salary = myRs.getDouble("salary");
            String department = myRs.getString("department");

            System.out.printf("%s, %s, %.2f, %s\n", lastName, firstName, salary, department);
        }
    }

    private static void deleteDataTransaktion() {
        try {
            //1.Get a connection to database
            Connection conn = DriverManager.getConnection(url, user, password);
            //2.Create a statment
            Statement stmt = conn.createStatement();
            //3.Execute SQL query
            String sql = "delete from transaktionen " +
                    "where betrag = 1500";

            int rowsAffected = stmt.executeUpdate(sql);

            System.out.println("Rows affected: " + rowsAffected);
            System.out.println("Delete complete.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void updateDataTransaktionen() {
        try {
            //1.Get Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            //2.Create a statment
            Statement stmt = conn.createStatement();
            //3.Execute SQL update statment
            String sql = "update transaktionen "
                    + "set betrag ='1500'"
                    + " where id=2";
            stmt.executeUpdate(sql);
            System.out.println("Update comolete.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void insertDatabaseTransaktionen() {
        try {
            //1.Get a connection to database
            Connection conn = DriverManager.getConnection(url, user, password);
            //2.Create a statemant
            Statement statement = conn.createStatement();
            //3.Exucute SQL query
            String sql = "insert into transaktionen"
                    + "(id, betrag, kontonummer)"
                    + "values ('2', '11','AT 1111 2222 3333 4444')";
            statement.executeUpdate(sql);
            System.out.println("Insert complete");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void readDatabaseTransaktionen() {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from transaktionen");
            while (rs.next()) {
                System.out.println("Transaktion Tabele");
                System.out.println("Id: " + rs.getInt("id") + "\n" + "Betrag: " + rs.getString("betrag")
                        + "\n" + "Kontonummer: " + rs.getString("kontonummer"));
            }

        } catch (Exception exe) {
            exe.printStackTrace();
        }
    }

    private static void readDatabaseKonto() {
        try {
            //1.Get a connection to database
            Connection myConn = DriverManager.getConnection(url, user, password);
            //2.Create a statment
            Statement myStmt = myConn.createStatement();
            //3.Execute SQL query
            ResultSet myRs = myStmt.executeQuery("select * from konto");
            //4.Process the result set
            while (myRs.next()) {
                System.out.println("Kontonummer: " + myRs.getString("kontonummer") + "\nPin: " + myRs.getString("pin"));
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    private static void pinEingabe(String kontonummer) {
        System.out.println("Kontonummer Eingabe");
        Scanner scanner = new Scanner(System.in);
        kontonummer = scanner.nextLine();
        System.out.println("Pin eingabe");
        String pin = scanner.nextLine();
        System.out.println("Kontonummer: " + kontonummer + "\nPin:" + pin);
    }
}
