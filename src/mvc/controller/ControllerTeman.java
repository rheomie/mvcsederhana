/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import mvc.model.ModelTeman;
import mvc.util.Koneksi;

/**
 *
 * @author MalingerS Media
 */
public class ControllerTeman {

    Koneksi koneksi = new Koneksi();

    public void simpanData(ModelTeman mk) {//memanggil kelas Model kesalahan dan membuat objek km
        koneksi.koneksiDatabase();
        String query = "insert into tbl_teman(nama,nope,email,alamat) values ('"+mk.getNama()+"','"+mk.getNope()+"','"+mk.getEmail()+"','"+mk.getAlamat()+"')";
        try {
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak berhasil disimpan");
            System.err.println(""+e);
        }

    }

    public void hapusData(ModelTeman mk) {
    try {
            koneksi.koneksiDatabase();
            String query = "delete from tbl_teman where id=('"+mk.getId()+"')";
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
            //koneksi.connect.close();
        } catch (SQLException e) {
            System.err.println("Error : "+e);
            JOptionPane.showMessageDialog(null, "Data TIDAK terhapus");
        }
    }

    public void ubahData(ModelTeman mk) {
         koneksi.koneksiDatabase();
         try {
            int id = mk.getId();
            String nama = mk.getNama();
            String nope = mk.getNope();
            String alamat = mk.getAlamat();
            String email = mk.getEmail();

            String query = "update tbl_teman "
                    + "set nama=('" + nama + "'),"
                    + "nope=('"+ nope +"'),"
                    + "email=('"+email+"'),"
                    + "alamat=('"+alamat+"')"
                    + "where id=('" + id + "')";
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } catch (SQLException e) {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data TIDAK terubah");
        }
    }
}
