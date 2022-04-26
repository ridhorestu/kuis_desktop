/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kuis.model.headphone;
/**
 *
 * @author ridhorestu
 */
public class DBHandler {
    public final Connection conn;

    public DBHandler(String driver) {
        this.conn = DBHelper.getConnection(driver);
    }
    public void addHeadphone(Headphone hpn){
        String insertHpn = "INSERT INTO `headphone`(`kode`, `nama`, `tanggal_pembelian`,`jenis_headphone`,`merek_headphone`,`harga_headphone`)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertMhs);
            stmtInsert.setString(1, mhs.getKode());
            stmtInsert.setString(2, mhs.getNama());
            stmtInsert.setString(3, mhs.getTanggalpembeian());
            stmtInsert.setString(4, mhs.getJenisheadphone());
            stmtInsert.setString(5, mhs.getMerekheadphone());
            stmtInsert.setString(6, mhs.getHargaheadphone());
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}