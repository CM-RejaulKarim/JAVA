package learningjdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import learningjdbc.util.DbUtil;

public class LearningJDBC {

    public static void main(String[] args) {

        DbUtil du = new DbUtil();
        
        Scanner s = new Scanner(System.in);
        System.out.println("What do you Want? \nInput- enter:1 \nView- enter:2");
        int inp = s.nextInt();

        if (inp == 1) {
            String sql = "insert into student(name,  email, contact) values(?,?,?)";
            try {
                PreparedStatement ps = du.getCon().prepareStatement(sql);

                System.out.println("Enter Name");
                ps.setString(1, s.next());

                System.out.println("Enter Email");
                ps.setString(2, s.next());

                System.out.println("Enter Contact Address");
                ps.setString(3, s.next());

                ps.executeUpdate();

                ps.close();
                du.getCon().close();

                System.out.println("Done");

            } catch (SQLException ex) {
                Logger.getLogger(LearningJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (inp == 2) {
            String sql1 = "select * from student";

            try {
                PreparedStatement ps = du.getCon().prepareStatement(sql1);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String contact = rs.getString("contact");

                    System.out.println("ID:" + id + ", Name: " + name + ", Email: " + email + ", Contact: " + contact);
                }
                ps.close();
                du.getCon().close();

            } catch (SQLException ex) {
                Logger.getLogger(LearningJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("Try Again.");
        }

    }

}
