package bankomat_sql;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/bankomat";
    private static final String user = "root";
    private static final String password = "1qayxsw23edc";
    private static String sqlKontonummer;
    private static String sqlPin;

    public static void main(String[] args) {

        readDatabaseKonto();

        while (true) {
            boolean beenden = false;
            while (!beenden) {
                boolean kontoKorrekt = false;
                String kontonummer;
                Scanner scanner = new Scanner(System.in);

                while (!kontoKorrekt) {
                    System.out.print("Eingabe der Kontonummer ->");
                    kontonummer = scanner.nextLine();
                    System.out.print("Pin eingabe ->");
                    String pin = scanner.nextLine();

                    kontoKorrekt = pruefeKonto(kontonummer, pin);
                    if (kontoKorrekt) {
                        System.out.println("Eingabe richtig");
                    } else {
                        System.out.println("Eingabe falsch,  versuche es nocheinmal");
                        break;
                    }
                    System.out.println("Kontostand: " + getKontostand(kontonummer));
                    System.out.println("Auswahl: [1: Einzahlung 2: Auszahlung]");

                    int auswahl = scanner.nextInt();
                    System.out.println("Eingabe Betrag");
                    double betrag = scanner.nextDouble();

                    transaktionAusfuehren(auswahl, betrag, kontonummer);
                }
            }
        }
    }

    private static boolean pruefeKonto(String kontonummer, String pin) {

        boolean korrekt = false;
        if (sqlKontonummer.equals(kontonummer) && sqlPin.equals(pin)) {
            korrekt = true;
        } else {
            korrekt = false;
        }
        return korrekt;
    }

    private static void transaktionAusfuehren(int auswahl, double betrag, String kontonummer) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into " +
                    "transaktionen(betrag, kontonummer) values (?,?)");
                preparedStatement.setDouble(1, betrag);
                preparedStatement.setString(2, kontonummer);
                preparedStatement.executeUpdate();
                System.out.println("Transaktion complet");
                System.out.println("Kontostand: " + getKontostand(kontonummer));

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    private static double getKontostand(String kontonummer) {
        Connection conn = null;
        double betrag = 0;
        try {
            conn = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = conn.prepareStatement("Select betrag from transaktionen where kontonummer = ?");
            ps.setString(1, kontonummer);
            ResultSet rs = ps.executeQuery();
            rs.next();
            betrag = rs.getDouble("betrag");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return betrag;
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
                sqlKontonummer = myRs.getString("kontonummer");
                sqlPin = myRs.getString("pin");
                //System.out.println("Kontonummer: " + sqlKontonummer + "\nPin: " + sqlPin);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
