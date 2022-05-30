package database;

import java.sql.*;

public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;

    public DatabaseHandler(){
        createConnection();
    }

    public void createTable(String folderName) {
        String TABLE_NAME = folderName;
        try {
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()){
                System.out.println("Table " + TABLE_NAME + " exists");
            }else {
                String statement = "CREATE TABLE " + TABLE_NAME + "("
                        + "path varchar(200) primary key, \n"
                        + "name varchar(200), \n"
                        + "extension varchar(200), \n"
                        + "size varchar(200))";
                System.out.println(statement);
                stmt.execute(statement);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void createConnection() {
        try {
            //Class.forName("org.apache.derby.jdbc.EmbeddedDriver"). newInstance();
            conn = DriverManager.getConnection(DB_url);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
    public boolean execAction(String qu){
        try{
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

