import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Sql {
	private static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    private static final String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=SystemInfo;user=sa;password=ali@786";
    //To make Windows authentication work we have to set the path to sqljdbc_auth.dll at the command line

    public static void main(String[] args) {
        System.out.println("Program started");
        try {
            Class.forName(JDBC_DRIVER);

            try (Connection databaseConnection = DriverManager.getConnection(JDBC_URL)) {
                Statement sqlStatement = databaseConnection.createStatement();
//            Statement sqlStatement = getConnectionStatement();
                ResultSet rs;
                
                // >>>>>>>>>>>>>>>>>>> DML Query <<<<<<<<<<<<<<<<<<<<<<
//                String newAddress = "Islamaabad";
//                String name = "Waqar";
//                
//                String sql = "UPDATE Person  SET address = '" + newAddress +"' WHERE FirstName = '" + name +"'";
//                
//                int num = sqlStatement.executeUpdate(sql);
 
//                System.err.println(num + "records updated");
                //==========================================================================
                
                
                
                // >>>>>>>>>>>>>>>>>>> ending DML Query <<<<<<<<<<<<<<<<<<<<<<
                
                String queryString = "select * from systemInfo";
                
                
                rs = sqlStatement.executeQuery(queryString);
                

                
                while (rs.next()) {
                    printResultSetRow(rs);

                }   //close the result set
                rs.close();
                System.out.println("\nClosing database connection");
                //close the database connection
            }
//            Statement sqlStatement = getConnectionStatement();
        } catch (SQLException err) {
            System.err.println("Error connecting to the database");
            err.printStackTrace(System.err);
            System.exit(0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Program finished");
    }

    /**
     * Prints each row in the ResultSet object to the screen.
     *
     * @param rs the result set from the SELECT query
     * @throws SQLException SQLException thrown on error
     */
    public static void printResultSetRow(ResultSet rs) throws SQLException {
        //Use the column name alias as specified in the above query
        String ID = rs.getString(1);
        String DataEntryDate = rs.getString(2);
        String Department = rs.getString(3);
        String EmployeeName = rs.getString(4);
        String Brand = rs.getString(5);
        String Model = rs.getString(6);
        String CPU = rs.getString(7);
        String RAM = rs.getString(8);
        String HardDisk = rs.getString(9);
        String IP = rs.getString(10);

        System.out.println(ID + " | " + DataEntryDate + " |" + Department + " | " + EmployeeName + " | " + Brand + " | " + Model + " | " + 
        		CPU + " | " + RAM + " | " + HardDisk + " | " + IP);
    }

}
