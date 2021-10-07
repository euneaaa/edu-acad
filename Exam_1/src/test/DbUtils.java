package test;

import java.awt.dnd.DragGestureEvent;
import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class DbUtils {
    private static DbUtils util = new DbUtils();
    private DbUtils(){}
    public static DbUtils getInstance(){return util;}
    public Connection getcon() throws  Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName(driver);
        Connection conn= DriverManager.getConnection(url, "root","koreait");
        return conn;
    }
    public void closeCon(Connection conn){
        if (conn != null){
            try {
                conn.close();
            }catch (Exception e){}
        }
    }
}
