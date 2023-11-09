package org.startsteps.week10.day04;

public class DependencyInversionDemo {
}

interface Keyboard { }

interface Monitor { }

class Windows98Machine{

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}

class StandardKeyboard implements Keyboard { }

class HDMonitor implements Keyboard { }




class MySQLDatabase {
    public void saveReport(String reportData) {
        // Saves report data to a MySQL database
        System.out.println("Report saved to MySQL database");
    }
}

// High-level module
class ReportGenerator {
    private MySQLDatabase database = new MySQLDatabase();

    public void generateReport(String data) {
        // Some report generation logic
        database.saveReport(data);  // Direct dependency on a low-level module
    }
}




// Abstraction
interface Database {
    void saveReport(String reportData);
}

// Low-level module
// Another low-level module
class MongoDB implements Database {
    public void saveReport(String reportData) {
        // Saves report data to a MongoDB database
        System.out.println("Report saved to MongoDB database");
    }
}

// High-level module
class MyReportGenerator {
    private Database database;

    public MyReportGenerator(Database database) {
        this.database = database;
    }

    public void generateReport(String data) {
        // Some report generation logic
        database.saveReport(data);  // Dependency inversion is applied
    }
}





