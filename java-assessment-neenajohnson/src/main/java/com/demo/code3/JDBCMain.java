package com.demo.code3;

import java.sql.*;

public class JDBCMain {
    public static void main() {

        try (
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/training","root","root");

            PreparedStatement ps = con.prepareStatement("INSERT INTO students(id,name,age,grade) VALUES (?,?,?,?)");
        ){
            ps.setInt(1, 1);
            ps.setString(2, "Neena");
            ps.setInt(3, 22);
            ps.setString(4,"A");

            ps.executeUpdate();

            ps.setInt(1, 2);
            ps.setString(2, "Junia");
            ps.setInt(3, 65);
            ps.setString(4,"B");
            ps.executeUpdate();

            ps.setInt(1, 3);
            ps.setString(2, "Olivia");
            ps.setInt(3, 14);
            ps.setString(4,"C");
            ps.executeUpdate();

            ps.setInt(1, 4);
            ps.setString(2, "Nisha");
            ps.setInt(3, 36);
            ps.setString(4,"D");
            ps.executeUpdate();

            ps.setInt(1, 5);
            ps.setString(2, "Pragya");
            ps.setInt(3, 16);
            ps.setString(4,"B");
            ps.executeUpdate();


            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getInt(3)
                );
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

