/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyhonhan;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Tamtrutamvang {
     public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/quanly";
        var user = "root";
        var password = "";
        try(Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Ket noi mysql thanh cong");
            System.out.println(conn.getCatalog());
            String sql = "select * from tamtrutamvang";
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet r1 = pr.executeQuery();
            while(r1.next()) {
                System.out.print(r1.getInt("ID_TamTruTamVang")+"-");
                System.out.print(r1.getInt("ID_NhanKhau")+"-");
                System.out.print(r1.getString("Loai")+"-");
                System.out.print(r1.getDate("NgayBatDau")+"-"); 
                System.out.print(r1.getDate("NgayKetThuc")+"\n"); 
                System.out.print(r1.getString("NoiDen_NoDi")+"-");
            }
            
    } catch (SQLException ex){
        Logger.getLogger(ConnectToXAMPP.class.getName()).log(Level.SEVERE, null, ex);
    
}
}
    
}
