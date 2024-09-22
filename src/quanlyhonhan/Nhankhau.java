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
public class Nhankhau {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/quanly";
        var user = "root";
        var password = "";
        try(Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Ket noi mysql thanh cong");
            System.out.println(conn.getCatalog());
            String sql = "select * from nhankhau";
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet r1 = pr.executeQuery();
            while(r1.next()) {
                System.out.print(r1.getInt("ID_NhanKhau")+"-");
                System.out.print(r1.getString("HoTen")+"-");
                System.out.print(r1.getDate("NgaySinh")+"-");
                System.out.print(r1.getString("NoiSinh")+"-");
                System.out.print(r1.getDate("NgayDangKyThuongTru")+"-"); 
                System.out.print(r1.getString("SoCMND_CCCD")+"-");
                System.out.print(r1.getDate("NgayCapCMND_CCCD")+"-");
                System.out.print(r1.getString("NoiCapCMND_CCCD")+"-");
                System.out.print(r1.getString("NgheNghiep")+"-");
                System.out.print(r1.getString("QuanHeVoiChuHo")+"-");
                System.out.print(r1.getInt("ID_HoKhau")+"\n");
                
            }
            
    } catch (SQLException ex){
        Logger.getLogger(ConnectToXAMPP.class.getName()).log(Level.SEVERE, null, ex);
    
}
}
    
}
