/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTB.CONNECTS;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabor_hanacsek
 */
public class postgreconnect {

    public ResultSet rs;
    public Connection conn;

    public Object lekerdez(String startQuery) throws SQLException, ClassNotFoundException {

        String url = "jdbc:postgresql://143.116.140.158/appu05";
        Properties props = new Properties();
        props.setProperty("user", "hbpackage_readonly");
        props.setProperty("password", "Sanmina1");
        Class.forName("org.postgresql.Driver");
        //props.setProperty("ssl","true");

        conn = DriverManager.getConnection(url, props);
        Statement st = conn.createStatement();

        rs = st.executeQuery(startQuery);

        return rs;

    }

    public void feltolt(String query, boolean infobox) {
        Connection conn = null;
        Statement stmt = null;
        try {

            String driver = "com.mysql.jdbc.driver";
            String url = "jdbc:mysql://143.116.140.114:3306/planningdb?characterEncoding=utf8";
            String username = "plan";
            String password = "plan500";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            stmt.executeUpdate(query);

            if (infobox == true) {
              
            }

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();

          

        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
           

        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }

    public void kinyir() {

        try {
            if (conn != null) {
                this.rs.close();
                this.conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(postgreconnect.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
