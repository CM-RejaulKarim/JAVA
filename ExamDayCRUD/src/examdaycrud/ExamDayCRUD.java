package examdaycrud;

import dbutil.ExamDayCrudDbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExamDayCRUD {

    static ExamDayCrudDbUtil util = new ExamDayCrudDbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static void main(String[] args) {
        saveTsp("ccsl", "01768932543", "ccsl@mail.com", "shankar");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        System.out.println("After Save");
        showAllTsp();
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        updateTsp("CCSL", "011735846642", "ccsl@yahoo.com", "shankar Plaza,Dhanmondi", 1);
        
        System.out.println("After Update");
        showAllTsp();
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        deleteTsp(1);
        
        System.out.println("After Delete");
        showAllTsp();

    }

    public static void saveTsp(String name, String cell, String email, String address) {
        sql = "insert into tsp(name, cell,email, address) values(?,?,?,?)";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();
            System.out.println("Save Done");

        } catch (SQLException ex) {
            Logger.getLogger(ExamDayCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllTsp() {

        sql = "select * from tsp";

        try {
            ps = util.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String cell = rs.getString("cell");
                String email = rs.getString("email");
                String address = rs.getString("address");

                System.out.println("ID:" + id + ", Name:" + name + ", Cell:" + cell + ", Email:" + email + ", Address:" + address);
            }
            rs.close();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(ExamDayCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static void updateTsp(String name, String cell, String email, String address, int id){
        
       sql= "update tsp set name=?, cell=?,email=?, address=? where id=?";
       
       try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setInt(5, id);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(ExamDayCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void deleteTsp(int id){
        
       sql="delete from tsp where id=?";
       
        try {
            ps=util.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();

            ps.close();
            util.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ExamDayCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
