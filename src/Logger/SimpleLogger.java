package Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//wird im projekt EnumExeption ausgeführt

/***
 * /***
 *  * Simple Logger
 *  * Schreibe einen einfacher Logger, welcher eine Nachricht (message) und einen Typ (type) als
 *  * Eingabeparameter entgegen nimmt. Der Logger kennt folgende drei Typen: Fehler (Error),
 *  * Information (Info), Warnung (Warning). Die empfangenen Nachrichten sollen im Format
 *  * [Datum] - [Uhrzeit] - [Typ] - [Nachricht]
 *  * in unser Logfile (log.txt) und in die Konsole geschrieben werden.
 *  * Der Logger soll im System nur einmalig instanziiert werden können (Singleton).
 *  * Baue den Logger in ein bestehendes Projekt ein (bzw. ersetze damit das System.out...).
 *  * Pseudo-Code:
 *  * Logger logger = Logger.getInstance();
 *  * logger.log(LogType.INFO, “dies ist eine Information”);
 *  * Ausgabe (in Konsole und log.txt):
 *  * 20.02.2021 - 10:41 - INFO - dies ist eine Information
 *  */


public class SimpleLogger {
    private static final String LOG_FILE_PATH = "log.txt";
    private static SimpleLogger instance;
    private final File logfile;

    private SimpleLogger() {
        logfile = new File(LOG_FILE_PATH);
        System.out.println("Logfile: " + logfile.getAbsolutePath());
    }

    public static SimpleLogger getInstance() {
        if (instance == null) {
            instance = new SimpleLogger();
        }
        return instance;
    }

    public void log(LogType type, String message) {
        String formattedMessage = getFormattedMessage(type, message);
        System.out.println(formattedMessage);
        writeToLogfile(formattedMessage);
    }

    private void writeToLogfile(String formattedMessage) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(logfile, true);
            writer.append(formattedMessage + "\n");
        } catch (IOException e) {
            System.err.println("error writing to file " + LOG_FILE_PATH);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("error closing writer for file " + LOG_FILE_PATH);
                }
            }
        }
    }

    private String getFormattedMessage(LogType type, String message) {
        Date now = new Date();
        // https://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm");

        String date = dateFormat.format(now);
        String time = timeFormat.format(now);

        return String.join(" - ", date, time, type.toString(), message);
    }
}