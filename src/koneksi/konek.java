/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class konek {
    static private String DB;
    static private String user;
    static private String pass;
    static private Connection Koneksi;
    
    public static Connection getConnection(){
        return startConnection("jadwal", "root", "");
    }
    public static Connection getConnection(String user, String pass){
        return startConnection("jadwal", user, pass);
    }
    public static Connection getConnection(String DB,String user, String pass){
        return startConnection(DB, user, pass);
    }
    public static Connection startConnection(String DB, String user, String pass){
        try{
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/"+DB,
                                                   user,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi Database Gagal");
        }
        return Koneksi;
    }
    
    @Override
    public String toString(){
        return "DB : " + getDB() + " User : " + getUser() + " Pass " + getPass();
    }

    /**
     * @return the DB
     */
    public static String getDB() {
        return DB;
    }

    /**
     * @return the user
     */
    public static String getUser() {
        return user;
    }

    /**
     * @return the pass
     */
    public static String getPass() {
        return pass;
    }

}  