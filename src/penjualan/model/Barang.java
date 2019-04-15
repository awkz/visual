/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjualan.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author STMIK-VI-01
 */
@Entity
@Table (name = "barang")
public class Barang implements Serializable{
    @Id
    @Column(name = "id", length = 10)
    private String id;
    @Column(name = "nama", length = 30)
    private String nama;
    @Column(name = "satuan", length = 400)
    private String satuan;
    @Column(name = "jumlahunit", length = 11)
    private String jumlahUnit;
    @Column(name = "hargabeli", length = 11)
    private String hargaBeli;
    @Column(name = "hargajual", length = 11)
    private String hargaJual;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the satuan
     */
    public String getSatuan() {
        return satuan;
    }

    /**
     * @param satuan the satuan to set
     */
    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    /**
     * @return the jumlahUnit
     */
    public String getJumlahUnit() {
        return jumlahUnit;
    }

    /**
     * @param jumlahUnit the jumlahUnit to set
     */
    public void setJumlahUnit(String jumlahUnit) {
        this.jumlahUnit = jumlahUnit;
    }

    /**
     * @return the hargaBeli
     */
    public String getHargaBeli() {
        return hargaBeli;
    }

    /**
     * @param hargaBeli the hargaBeli to set
     */
    public void setHargaBeli(String hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    /**
     * @return the hargaJual
     */
    public String getHargaJual() {
        return hargaJual;
    }

    /**
     * @param hargaJual the hargaJual to set
     */
    public void setHargaJual(String hargaJual) {
        this.hargaJual = hargaJual;
    }
    
    
    
}
