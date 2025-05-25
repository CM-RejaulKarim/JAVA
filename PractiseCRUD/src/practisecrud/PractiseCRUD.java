package practisecrud;

import dbutil.PractiseCRUDDbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PractiseCRUD {

    static PractiseCRUDDbUtil util = new PractiseCRUDDbUtil();
    static PreparedStatement ps;
    static String sql;
    static ResultSet rs;

    public static void main(String[] args) {
        addTeacher("Atik", "Member", "at@m.c");
        System.out.println("========================================\nAfter Save");
        showAllTeacher();
        
        updateTeacher("Atikur Rahman", "general", "at@m.c", 1);
        System.out.println("========================================\nAfter update");
        showAllTeacher();
        
        deleteTeacher(1);
        System.out.println("========================================\nAfter delete");
        showAllTeacher();
    }

    //mathod Starts From Here...
    public static void addTeacher(String name, String post, String email) {
        sql = "insert into teachers(name, post, email) values(?,?,?)";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, post);
            ps.setString(3, email);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();
            System.out.println("Teacher Added Successfully");

        } catch (SQLException ex) {
            Logger.getLogger(PractiseCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllTeacher() {

        sql = "select * from teachers";

        try {
            ps = util.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String post = rs.getString("post");
                String email = rs.getString("email");

                System.out.println("ID:" + id + ", Name:" + name + ", Post:" + post + ", Email:" + email);
            }
            rs.close();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(PractiseCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteTeacher(int id) {

        sql = "delete from teachers where id =?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(PractiseCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateTeacher(String name, String post, String email, int id) {
        sql = "update teachers set name=?, post=?, email=? where id =?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, post);
            ps.setString(3, email);
            ps.setInt(4, id);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(PractiseCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
